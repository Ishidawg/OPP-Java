package scripts.entities.core;

public class Movement {

    boolean jumping;
    double jumpHeight;

    double speed;
    double lowerMovementBySpeed;
    double upperMovementBySpeed;

    double leftMovementBySpeed;
    double rightMovementBySpeed;

    public Movement(boolean jumping, double jumpHeight, double speed, double lowerMovementBySpeed, double upperMovementBySpeed, double leftMovementBySpeed, double rightMovementBySpeed) {
        this.jumping = jumping;
        this.jumpHeight = jumpHeight;
        this.speed = speed;
        this.lowerMovementBySpeed = lowerMovementBySpeed;
        this.upperMovementBySpeed = upperMovementBySpeed;
        this.leftMovementBySpeed = leftMovementBySpeed;
        this.rightMovementBySpeed = rightMovementBySpeed;
    }

    public boolean isJumping() {
        return jumping;
    }

    public void setJumping(boolean jumping) {
        this.jumping = jumping;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getLowerMovementBySpeed() {
        return lowerMovementBySpeed;
    }

    public void setLowerMovementBySpeed(double lowerMovementBySpeed) {
        this.lowerMovementBySpeed = lowerMovementBySpeed;
    }

    public double getUpperMovementBySpeed() {
        return upperMovementBySpeed;
    }

    public void setUpperMovementBySpeed(double upperMovementBySpeed) {
        this.upperMovementBySpeed = upperMovementBySpeed;
    }

    public double getLeftMovementBySpeed() {
        return leftMovementBySpeed;
    }

    public void setLeftMovementBySpeed(double leftMovementBySpeed) {
        this.leftMovementBySpeed = leftMovementBySpeed;
    }

    public double getRightMovementBySpeed() {
        return rightMovementBySpeed;
    }

    public void setRightMovementBySpeed(double rightMovementBySpeed) {
        this.rightMovementBySpeed = rightMovementBySpeed;
    }

    public void checkMovement() {
        if (speed < lowerMovementBySpeed) {
            speed = lowerMovementBySpeed;
        }

        if (speed > upperMovementBySpeed) {
            speed = upperMovementBySpeed;
        }

        if (speed < leftMovementBySpeed) {
            speed = leftMovementBySpeed;
        }

        if (speed > rightMovementBySpeed) {
            speed = rightMovementBySpeed;
        }

        if (speed < jumpHeight) {
            speed = jumpHeight;
        }

        if (speed > jumpHeight) {
            speed = jumpHeight;
        }
    }
}
