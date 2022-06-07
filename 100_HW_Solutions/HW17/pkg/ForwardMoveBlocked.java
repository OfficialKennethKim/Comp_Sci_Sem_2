package pkg;

public boolean ForwardMoveBlocked() {
	if (facingRight && position >= hall.length - 1)
    return true;
    else if (facingRight && pos == 0)
    return true;
    return false; 
}

private void move() {
    if (hall[pos] > 0)
    if (hall[pos] == 0) {
        if (forwardMoveBlocked()) {
            facingRight != facingRight;
        }
        else if (facingRight) {
            pos++;
        }
        else {
            pos--;
        }
    }
}

public int clearHall() {
    int cnt = 0;
    while (!hallIsClear()) {
        move();
        count++; 
    }
    return count; 
}