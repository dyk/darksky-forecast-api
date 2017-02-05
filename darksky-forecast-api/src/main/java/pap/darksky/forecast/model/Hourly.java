/*
 * The MIT License
 *
 * Copyright 2017 Philipp-André Plogmann.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package pap.darksky.forecast.model;

import java.util.List;

/**
 * A data block containing the weather conditions hour-by-hour for the next two days.
 *
 * @author Puls.
 */
public class Hourly {

    private String summary;
    private String icon;
    private List<DataPoint> data;

    /**
     * @return A human-readable summary of this data block.
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary A human-readable summary of this data block.
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return A machine-readable text summary of this data block. (May take on the same values as the iconproperty of data
     * points.)
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon A machine-readable text summary of this data block. (May take on the same values as the iconproperty of data
     * points.)
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return List containing all DataPoints, ordered by time.
     */
    public List<DataPoint> getData() {
        return data;
    }

    /**
     * @param data List containing all DataPoints, ordered by time.
     */
    public void setData(List<DataPoint> data) {
        this.data = data;
    }

}
