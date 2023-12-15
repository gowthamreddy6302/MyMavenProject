package org.example;

import com.sun.source.doctree.SeeTree;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class NewCustomer {
    private String name;
    private String contact;
    private List<String> address;
    private Set<String> address1;
    private Map<String,String> address2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Set<String> getAddress1() {
        return address1;
    }

    public void setAddress1(Set<String> address1) {
        this.address1 = address1;
    }

    public Map<String, String> getAddress2() {
        return address2;
    }

    public void setAddress2(Map<String, String> address2) {
        this.address2 = address2;
    }
}
