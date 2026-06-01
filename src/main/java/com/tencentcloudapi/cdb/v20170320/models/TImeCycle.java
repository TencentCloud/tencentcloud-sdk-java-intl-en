/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TImeCycle extends AbstractModel {

    /**
    * Whether to choose Monday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
    */
    @SerializedName("Monday")
    @Expose
    private Boolean Monday;

    /**
    * During scaling, whether to choose Tuesday for expansion.
Description: Value "true" means select, value "false" means not select.
    */
    @SerializedName("Tuesday")
    @Expose
    private Boolean Tuesday;

    /**
    * Whether to choose Wednesday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
    */
    @SerializedName("Wednesday")
    @Expose
    private Boolean Wednesday;

    /**
    * Whether to choose Thursday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
    */
    @SerializedName("Thursday")
    @Expose
    private Boolean Thursday;

    /**
    * Whether to choose Friday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
    */
    @SerializedName("Friday")
    @Expose
    private Boolean Friday;

    /**
    * Whether to choose Saturday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
    */
    @SerializedName("Saturday")
    @Expose
    private Boolean Saturday;

    /**
    * Whether to choose Sunday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
    */
    @SerializedName("Sunday")
    @Expose
    private Boolean Sunday;

    /**
     * Get Whether to choose Monday for scaling during the period.
Description: Value "true" means select, value "false" means not select. 
     * @return Monday Whether to choose Monday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     */
    public Boolean getMonday() {
        return this.Monday;
    }

    /**
     * Set Whether to choose Monday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     * @param Monday Whether to choose Monday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     */
    public void setMonday(Boolean Monday) {
        this.Monday = Monday;
    }

    /**
     * Get During scaling, whether to choose Tuesday for expansion.
Description: Value "true" means select, value "false" means not select. 
     * @return Tuesday During scaling, whether to choose Tuesday for expansion.
Description: Value "true" means select, value "false" means not select.
     */
    public Boolean getTuesday() {
        return this.Tuesday;
    }

    /**
     * Set During scaling, whether to choose Tuesday for expansion.
Description: Value "true" means select, value "false" means not select.
     * @param Tuesday During scaling, whether to choose Tuesday for expansion.
Description: Value "true" means select, value "false" means not select.
     */
    public void setTuesday(Boolean Tuesday) {
        this.Tuesday = Tuesday;
    }

    /**
     * Get Whether to choose Wednesday for scaling during the period.
Description: Value "true" means select, value "false" means not select. 
     * @return Wednesday Whether to choose Wednesday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     */
    public Boolean getWednesday() {
        return this.Wednesday;
    }

    /**
     * Set Whether to choose Wednesday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     * @param Wednesday Whether to choose Wednesday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     */
    public void setWednesday(Boolean Wednesday) {
        this.Wednesday = Wednesday;
    }

    /**
     * Get Whether to choose Thursday for scaling during the period.
Description: Value "true" means select, value "false" means not select. 
     * @return Thursday Whether to choose Thursday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     */
    public Boolean getThursday() {
        return this.Thursday;
    }

    /**
     * Set Whether to choose Thursday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     * @param Thursday Whether to choose Thursday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     */
    public void setThursday(Boolean Thursday) {
        this.Thursday = Thursday;
    }

    /**
     * Get Whether to choose Friday for scaling during the period.
Description: Value "true" means select, value "false" means not select. 
     * @return Friday Whether to choose Friday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     */
    public Boolean getFriday() {
        return this.Friday;
    }

    /**
     * Set Whether to choose Friday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     * @param Friday Whether to choose Friday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     */
    public void setFriday(Boolean Friday) {
        this.Friday = Friday;
    }

    /**
     * Get Whether to choose Saturday for scaling during the period.
Description: Value "true" means select, value "false" means not select. 
     * @return Saturday Whether to choose Saturday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     */
    public Boolean getSaturday() {
        return this.Saturday;
    }

    /**
     * Set Whether to choose Saturday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     * @param Saturday Whether to choose Saturday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     */
    public void setSaturday(Boolean Saturday) {
        this.Saturday = Saturday;
    }

    /**
     * Get Whether to choose Sunday for scaling during the period.
Description: Value "true" means select, value "false" means not select. 
     * @return Sunday Whether to choose Sunday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     */
    public Boolean getSunday() {
        return this.Sunday;
    }

    /**
     * Set Whether to choose Sunday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     * @param Sunday Whether to choose Sunday for scaling during the period.
Description: Value "true" means select, value "false" means not select.
     */
    public void setSunday(Boolean Sunday) {
        this.Sunday = Sunday;
    }

    public TImeCycle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TImeCycle(TImeCycle source) {
        if (source.Monday != null) {
            this.Monday = new Boolean(source.Monday);
        }
        if (source.Tuesday != null) {
            this.Tuesday = new Boolean(source.Tuesday);
        }
        if (source.Wednesday != null) {
            this.Wednesday = new Boolean(source.Wednesday);
        }
        if (source.Thursday != null) {
            this.Thursday = new Boolean(source.Thursday);
        }
        if (source.Friday != null) {
            this.Friday = new Boolean(source.Friday);
        }
        if (source.Saturday != null) {
            this.Saturday = new Boolean(source.Saturday);
        }
        if (source.Sunday != null) {
            this.Sunday = new Boolean(source.Sunday);
        }
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

