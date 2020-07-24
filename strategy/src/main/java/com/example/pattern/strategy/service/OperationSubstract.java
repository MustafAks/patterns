package com.example.pattern.strategy.service;

public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int n1, int n2) {
        return n1 - n2;
    }
}
