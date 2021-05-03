package main.education.com.epam.taskone.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArray {
    private int[] dataArray;
    static final Logger logger = LogManager.getLogger();

    public CustomArray(int[] array) {
        this.dataArray = array;
    }

    public int[] getDataArray() {
        int[] copyDataArray = this.dataArray;
        return copyDataArray;
    }

    public void setDataArray(int[] dataArray) {
        logger.error("You can`t make changes");
    }

    public int length(){
        return this.getDataArray().length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int a : getDataArray()){
            stringBuilder.append(a + " ");
        }
        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        int[] array = this.dataArray;
        if (array == null){
            return 0;
        }
        int hashresult = 1;
        for (int value : array){
            hashresult = 31 * hashresult + value;
        }
        return hashresult;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof CustomArray)){
            return false;
        }
        CustomArray customArray = (CustomArray) obj;
        if (customArray.length() != this.dataArray.length){
            return false;
        }
        for (int i = 0; i < this.length(); i++) {
            if (customArray.getDataArray()[i] != this.dataArray[i]){
                return false;
            }
        }
        return true;
    }
}
