package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code
 */
public class Manager extends Approver {
    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(id, cost, type)) {
            System.out.println("Manager approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Manager.");
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        boolean result = false;

        switch (type) {
        case CONSUMABLES:
            if (cost < 300) {
                result = true;
                return result;
            } else {
                break;
            }
        case CLERICAL:
            if (cost < 500) {
                result = true;
                return result;
            } else {
                break;
            }
        case GADGETS:
            if (cost < 1000) {
                result = true;
                return result;
            } else {
                break;
            }
        case GAMING:
            if (cost < 3000) {
                result = true;
                return result;
            } else {
                break;
            }
        case PC:
            if (cost < 5000) {
                result = true;
                return result;
            } else {
                break;
            }
        default:
            result = false;
            return result;
    }
    return result;
    }
}