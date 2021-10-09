package ru.mirea.lab3.AbstractClass;

public abstract class Shape {
        protected String color;
        protected boolean filled;
        public Shape()
        {
                this.color="Gray";
                this.filled=false;
        }
        public Shape(String inputColor,boolean inputFilled)
        {
                this.color=inputColor;
                this.filled=inputFilled;
        }
        public String getColor()
        {
                return this.color;
        }
        public boolean isFilled()
        {
                return this.filled;
        }
        public void setFilled(boolean inputFilled)
        {
                this.filled=inputFilled;
        }
        public double getArea()
        {
                return 1;
        }
        public double getPerimeter()
        {
                return 1;
        }
        public String toString()
        {
                return "Shape - Color: "+ this.color;
        }

}
