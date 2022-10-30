package handlers;

import common.Type;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver{
    @Override
    public void approve(int id, double cost, Type type) {
    	if (canApprove(id, cost, type)) {
            System.out.println("Vice President approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Vice President.");
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
    	boolean result = false;

        switch (type) {
            case CONSUMABLES:
                if (cost < 700) {
                    result = true;
                    return result;
                } else {
                    break;
                }
            case CLERICAL:
                if (cost < 1500) {
                    result = true;
                    return result;
                } else {
                    break;
                }
            case GADGETS:
                if (cost < 2000) {
                    result = true;
                    return result;
                } else {
                    break;
                }
            case GAMING:
                if (cost < 4500) {
                    result = true;
                    return result;
                } else {
                    break;
                }
            case PC:
                if (cost < 6500) {
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