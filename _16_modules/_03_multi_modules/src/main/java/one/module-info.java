module one {
    requires two;
    provides operation.Math with test.MathImpl;
    provides operation.Abstract with test.AbstractTest;
}