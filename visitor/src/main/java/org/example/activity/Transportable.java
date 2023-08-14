package org.example.activity;

import org.example.visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);
}
