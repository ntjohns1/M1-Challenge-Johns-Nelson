package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Address shippingAddress;
    Address billingAddress;
    Customer customer;

    @Before
    public void setUp() throws Exception {
        shippingAddress =new Address("1234 Address St.", "Apt A", "Durham", "NC", "27705");
        billingAddress =new Address("4321 Billings Ave.", "", "Durham", "NC", "27701");
        customer = new Customer("Gale", "Waterford", "galew@email.com", "555-555-5555",shippingAddress, billingAddress, true);
    }

    @Test
    public void shouldGetIsRewardsMember() {
        assertTrue(customer.isRewardsMember());
    }

    @Test
    public void shouldSetIsRewardsMember() {
        customer.setRewardsMember(false);
        assertFalse(customer.isRewardsMember());
    }

    @Test
    public void shouldSetBillingAddress() {
        customer.getBillingAddress().setCity("Raleigh");
        customer.getBillingAddress().setStreet1("Englewood Ave.");
        customer.getBillingAddress().setStreet2("Apt. 235");
        customer.getBillingAddress().setZipCode("27720");
        assertEquals("Raleigh", customer.getBillingAddress().getCity());
        assertEquals("Englewood Ave.", customer.getBillingAddress().getStreet1());
        assertEquals("Apt. 235", customer.getBillingAddress().getStreet2());
        assertEquals("27720", customer.getBillingAddress().getZipCode());
    }

    @Test
    public void shouldSetShippingAddress() {
        customer.getShippingAddress().setCity("Fairfax");
        customer.getShippingAddress().setState("VA");
        customer.getShippingAddress().setZipCode("44444");
        assertEquals("Fairfax", customer.getShippingAddress().getCity());
        assertEquals("VA", customer.getShippingAddress().getState());
        assertEquals("44444", customer.getShippingAddress().getZipCode());
    }

}