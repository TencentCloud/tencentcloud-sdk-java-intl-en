/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonTimeWindow extends AbstractModel{

    /**
    * Time window on Monday in the format of 02:00-06:00
    */
    @SerializedName("Monday")
    @Expose
    private String Monday;

    /**
    * Time window on Tuesday in the format of 02:00-06:00
    */
    @SerializedName("Tuesday")
    @Expose
    private String Tuesday;

    /**
    * Time window on Wednesday in the format of 02:00-06:00
    */
    @SerializedName("Wednesday")
    @Expose
    private String Wednesday;

    /**
    * Time window on Thursday in the format of 02:00-06:00
    */
    @SerializedName("Thursday")
    @Expose
    private String Thursday;

    /**
    * Time window on Friday in the format of 02:00-06:00
    */
    @SerializedName("Friday")
    @Expose
    private String Friday;

    /**
    * Time window on Saturday in the format of 02:00-06:00
    */
    @SerializedName("Saturday")
    @Expose
    private String Saturday;

    /**
    * Time window on Sunday in the format of 02:00-06:00
    */
    @SerializedName("Sunday")
    @Expose
    private String Sunday;

    /**
     * Get Time window on Monday in the format of 02:00-06:00 
     * @return Monday Time window on Monday in the format of 02:00-06:00
     */
    public String getMonday() {
        return this.Monday;
    }

    /**
     * Set Time window on Monday in the format of 02:00-06:00
     * @param Monday Time window on Monday in the format of 02:00-06:00
     */
    public void setMonday(String Monday) {
        this.Monday = Monday;
    }

    /**
     * Get Time window on Tuesday in the format of 02:00-06:00 
     * @return Tuesday Time window on Tuesday in the format of 02:00-06:00
     */
    public String getTuesday() {
        return this.Tuesday;
    }

    /**
     * Set Time window on Tuesday in the format of 02:00-06:00
     * @param Tuesday Time window on Tuesday in the format of 02:00-06:00
     */
    public void setTuesday(String Tuesday) {
        this.Tuesday = Tuesday;
    }

    /**
     * Get Time window on Wednesday in the format of 02:00-06:00 
     * @return Wednesday Time window on Wednesday in the format of 02:00-06:00
     */
    public String getWednesday() {
        return this.Wednesday;
    }

    /**
     * Set Time window on Wednesday in the format of 02:00-06:00
     * @param Wednesday Time window on Wednesday in the format of 02:00-06:00
     */
    public void setWednesday(String Wednesday) {
        this.Wednesday = Wednesday;
    }

    /**
     * Get Time window on Thursday in the format of 02:00-06:00 
     * @return Thursday Time window on Thursday in the format of 02:00-06:00
     */
    public String getThursday() {
        return this.Thursday;
    }

    /**
     * Set Time window on Thursday in the format of 02:00-06:00
     * @param Thursday Time window on Thursday in the format of 02:00-06:00
     */
    public void setThursday(String Thursday) {
        this.Thursday = Thursday;
    }

    /**
     * Get Time window on Friday in the format of 02:00-06:00 
     * @return Friday Time window on Friday in the format of 02:00-06:00
     */
    public String getFriday() {
        return this.Friday;
    }

    /**
     * Set Time window on Friday in the format of 02:00-06:00
     * @param Friday Time window on Friday in the format of 02:00-06:00
     */
    public void setFriday(String Friday) {
        this.Friday = Friday;
    }

    /**
     * Get Time window on Saturday in the format of 02:00-06:00 
     * @return Saturday Time window on Saturday in the format of 02:00-06:00
     */
    public String getSaturday() {
        return this.Saturday;
    }

    /**
     * Set Time window on Saturday in the format of 02:00-06:00
     * @param Saturday Time window on Saturday in the format of 02:00-06:00
     */
    public void setSaturday(String Saturday) {
        this.Saturday = Saturday;
    }

    /**
     * Get Time window on Sunday in the format of 02:00-06:00 
     * @return Sunday Time window on Sunday in the format of 02:00-06:00
     */
    public String getSunday() {
        return this.Sunday;
    }

    /**
     * Set Time window on Sunday in the format of 02:00-06:00
     * @param Sunday Time window on Sunday in the format of 02:00-06:00
     */
    public void setSunday(String Sunday) {
        this.Sunday = Sunday;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Monday", this.Monday);
        this.setParamSimple(map, prefix + "Tuesday", this.Tuesday);
        this.setParamSimple(map, prefix + "Wednesday", this.Wednesday);
        this.setParamSimple(map, prefix + "Thursday", this.Thursday);
        this.setParamSimple(map, prefix + "Friday", this.Friday);
        this.setParamSimple(map, prefix + "Saturday", this.Saturday);
        this.setParamSimple(map, prefix + "Sunday", this.Sunday);

    }
}

