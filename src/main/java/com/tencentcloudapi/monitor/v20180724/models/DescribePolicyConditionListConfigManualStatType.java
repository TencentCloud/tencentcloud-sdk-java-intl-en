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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListConfigManualStatType extends AbstractModel{

    /**
    * Data aggregation method in a period of 5 seconds.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("P5")
    @Expose
    private String P5;

    /**
    * Data aggregation method in a period of 10 seconds.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("P10")
    @Expose
    private String P10;

    /**
    * Data aggregation method in a period of 1 minute.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("P60")
    @Expose
    private String P60;

    /**
    * Data aggregation method in a period of 5 minutes.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("P300")
    @Expose
    private String P300;

    /**
    * Data aggregation method in a period of 10 minutes.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("P600")
    @Expose
    private String P600;

    /**
    * Data aggregation method in a period of 30 minutes.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("P1800")
    @Expose
    private String P1800;

    /**
    * Data aggregation method in a period of 1 hour.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("P3600")
    @Expose
    private String P3600;

    /**
    * Data aggregation method in a period of 1 day.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("P86400")
    @Expose
    private String P86400;

    /**
     * Get Data aggregation method in a period of 5 seconds.
Note: This field may return null, indicating that no valid value was found. 
     * @return P5 Data aggregation method in a period of 5 seconds.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getP5() {
        return this.P5;
    }

    /**
     * Set Data aggregation method in a period of 5 seconds.
Note: This field may return null, indicating that no valid value was found.
     * @param P5 Data aggregation method in a period of 5 seconds.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setP5(String P5) {
        this.P5 = P5;
    }

    /**
     * Get Data aggregation method in a period of 10 seconds.
Note: This field may return null, indicating that no valid value was found. 
     * @return P10 Data aggregation method in a period of 10 seconds.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getP10() {
        return this.P10;
    }

    /**
     * Set Data aggregation method in a period of 10 seconds.
Note: This field may return null, indicating that no valid value was found.
     * @param P10 Data aggregation method in a period of 10 seconds.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setP10(String P10) {
        this.P10 = P10;
    }

    /**
     * Get Data aggregation method in a period of 1 minute.
Note: This field may return null, indicating that no valid value was found. 
     * @return P60 Data aggregation method in a period of 1 minute.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getP60() {
        return this.P60;
    }

    /**
     * Set Data aggregation method in a period of 1 minute.
Note: This field may return null, indicating that no valid value was found.
     * @param P60 Data aggregation method in a period of 1 minute.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setP60(String P60) {
        this.P60 = P60;
    }

    /**
     * Get Data aggregation method in a period of 5 minutes.
Note: This field may return null, indicating that no valid value was found. 
     * @return P300 Data aggregation method in a period of 5 minutes.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getP300() {
        return this.P300;
    }

    /**
     * Set Data aggregation method in a period of 5 minutes.
Note: This field may return null, indicating that no valid value was found.
     * @param P300 Data aggregation method in a period of 5 minutes.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setP300(String P300) {
        this.P300 = P300;
    }

    /**
     * Get Data aggregation method in a period of 10 minutes.
Note: This field may return null, indicating that no valid value was found. 
     * @return P600 Data aggregation method in a period of 10 minutes.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getP600() {
        return this.P600;
    }

    /**
     * Set Data aggregation method in a period of 10 minutes.
Note: This field may return null, indicating that no valid value was found.
     * @param P600 Data aggregation method in a period of 10 minutes.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setP600(String P600) {
        this.P600 = P600;
    }

    /**
     * Get Data aggregation method in a period of 30 minutes.
Note: This field may return null, indicating that no valid value was found. 
     * @return P1800 Data aggregation method in a period of 30 minutes.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getP1800() {
        return this.P1800;
    }

    /**
     * Set Data aggregation method in a period of 30 minutes.
Note: This field may return null, indicating that no valid value was found.
     * @param P1800 Data aggregation method in a period of 30 minutes.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setP1800(String P1800) {
        this.P1800 = P1800;
    }

    /**
     * Get Data aggregation method in a period of 1 hour.
Note: This field may return null, indicating that no valid value was found. 
     * @return P3600 Data aggregation method in a period of 1 hour.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getP3600() {
        return this.P3600;
    }

    /**
     * Set Data aggregation method in a period of 1 hour.
Note: This field may return null, indicating that no valid value was found.
     * @param P3600 Data aggregation method in a period of 1 hour.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setP3600(String P3600) {
        this.P3600 = P3600;
    }

    /**
     * Get Data aggregation method in a period of 1 day.
Note: This field may return null, indicating that no valid value was found. 
     * @return P86400 Data aggregation method in a period of 1 day.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getP86400() {
        return this.P86400;
    }

    /**
     * Set Data aggregation method in a period of 1 day.
Note: This field may return null, indicating that no valid value was found.
     * @param P86400 Data aggregation method in a period of 1 day.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setP86400(String P86400) {
        this.P86400 = P86400;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "P5", this.P5);
        this.setParamSimple(map, prefix + "P10", this.P10);
        this.setParamSimple(map, prefix + "P60", this.P60);
        this.setParamSimple(map, prefix + "P300", this.P300);
        this.setParamSimple(map, prefix + "P600", this.P600);
        this.setParamSimple(map, prefix + "P1800", this.P1800);
        this.setParamSimple(map, prefix + "P3600", this.P3600);
        this.setParamSimple(map, prefix + "P86400", this.P86400);

    }
}

