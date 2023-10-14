package repository;

import exception.OperatorNotFoundException;
import models.Operator;

import java.util.HashMap;
import java.util.Map;

public class OperatorRepository {
    private Map<Integer, Operator> operatorMap;

    public OperatorRepository() {
        this.operatorMap = new HashMap<>();
    }
    public Operator get(int operatorId) throws OperatorNotFoundException {
        Operator operator = operatorMap.get(operatorId);
        if(operator == null){
            throw new OperatorNotFoundException("Operator Not found for id: " + operatorId);
        }return operator;
    }
    public Operator put(Operator operator){
        operatorMap.put(operator.getId(),operator);
        return operator;
    }
}
