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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimeWindowResponse extends AbstractModel {

    /**
    * List of maintenance time windows on Monday.
    */
    @SerializedName("Monday")
    @Expose
    private String [] Monday;

    /**
    * List of maintenance time windows on Tuesday.
    */
    @SerializedName("Tuesday")
    @Expose
    private String [] Tuesday;

    /**
    * List of maintenance time windows on Wednesday.
    */
    @SerializedName("Wednesday")
    @Expose
    private String [] Wednesday;

    /**
    * List of maintenance time windows on Thursday.
    */
    @SerializedName("Thursday")
    @Expose
    private String [] Thursday;

    /**
    * List of maintenance time windows on Friday.
    */
    @SerializedName("Friday")
    @Expose
    private String [] Friday;

    /**
    * List of maintenance time windows on Saturday.
    */
    @SerializedName("Saturday")
    @Expose
    private String [] Saturday;

    /**
    * List of maintenance time windows on Sunday.
    */
    @SerializedName("Sunday")
    @Expose
    private String [] Sunday;

    /**
    * Maximum data delay threshold
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private Long MaxDelayTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of maintenance time windows on Monday. 
     * @return Monday List of maintenance time windows on Monday.
     */
    public String [] getMonday() {
        return this.Monday;
    }

    /**
     * Set List of maintenance time windows on Monday.
     * @param Monday List of maintenance time windows on Monday.
     */
    public void setMonday(String [] Monday) {
        this.Monday = Monday;
    }

    /**
     * Get List of maintenance time windows on Tuesday. 
     * @return Tuesday List of maintenance time windows on Tuesday.
     */
    public String [] getTuesday() {
        return this.Tuesday;
    }

    /**
     * Set List of maintenance time windows on Tuesday.
     * @param Tuesday List of maintenance time windows on Tuesday.
     */
    public void setTuesday(String [] Tuesday) {
        this.Tuesday = Tuesday;
    }

    /**
     * Get List of maintenance time windows on Wednesday. 
     * @return Wednesday List of maintenance time windows on Wednesday.
     */
    public String [] getWednesday() {
        return this.Wednesday;
    }

    /**
     * Set List of maintenance time windows on Wednesday.
     * @param Wednesday List of maintenance time windows on Wednesday.
     */
    public void setWednesday(String [] Wednesday) {
        this.Wednesday = Wednesday;
    }

    /**
     * Get List of maintenance time windows on Thursday. 
     * @return Thursday List of maintenance time windows on Thursday.
     */
    public String [] getThursday() {
        return this.Thursday;
    }

    /**
     * Set List of maintenance time windows on Thursday.
     * @param Thursday List of maintenance time windows on Thursday.
     */
    public void setThursday(String [] Thursday) {
        this.Thursday = Thursday;
    }

    /**
     * Get List of maintenance time windows on Friday. 
     * @return Friday List of maintenance time windows on Friday.
     */
    public String [] getFriday() {
        return this.Friday;
    }

    /**
     * Set List of maintenance time windows on Friday.
     * @param Friday List of maintenance time windows on Friday.
     */
    public void setFriday(String [] Friday) {
        this.Friday = Friday;
    }

    /**
     * Get List of maintenance time windows on Saturday. 
     * @return Saturday List of maintenance time windows on Saturday.
     */
    public String [] getSaturday() {
        return this.Saturday;
    }

    /**
     * Set List of maintenance time windows on Saturday.
     * @param Saturday List of maintenance time windows on Saturday.
     */
    public void setSaturday(String [] Saturday) {
        this.Saturday = Saturday;
    }

    /**
     * Get List of maintenance time windows on Sunday. 
     * @return Sunday List of maintenance time windows on Sunday.
     */
    public String [] getSunday() {
        return this.Sunday;
    }

    /**
     * Set List of maintenance time windows on Sunday.
     * @param Sunday List of maintenance time windows on Sunday.
     */
    public void setSunday(String [] Sunday) {
        this.Sunday = Sunday;
    }

    /**
     * Get Maximum data delay threshold 
     * @return MaxDelayTime Maximum data delay threshold
     */
    public Long getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set Maximum data delay threshold
     * @param MaxDelayTime Maximum data delay threshold
     */
    public void setMaxDelayTime(Long MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTimeWindowResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimeWindowResponse(DescribeTimeWindowResponse source) {
        if (source.Monday != null) {
            this.Monday = new String[source.Monday.length];
            for (int i = 0; i < source.Monday.length; i++) {
                this.Monday[i] = new String(source.Monday[i]);
            }
        }
        if (source.Tuesday != null) {
            this.Tuesday = new String[source.Tuesday.length];
            for (int i = 0; i < source.Tuesday.length; i++) {
                this.Tuesday[i] = new String(source.Tuesday[i]);
            }
        }
        if (source.Wednesday != null) {
            this.Wednesday = new String[source.Wednesday.length];
            for (int i = 0; i < source.Wednesday.length; i++) {
                this.Wednesday[i] = new String(source.Wednesday[i]);
            }
        }
        if (source.Thursday != null) {
            this.Thursday = new String[source.Thursday.length];
            for (int i = 0; i < source.Thursday.length; i++) {
                this.Thursday[i] = new String(source.Thursday[i]);
            }
        }
        if (source.Friday != null) {
            this.Friday = new String[source.Friday.length];
            for (int i = 0; i < source.Friday.length; i++) {
                this.Friday[i] = new String(source.Friday[i]);
            }
        }
        if (source.Saturday != null) {
            this.Saturday = new String[source.Saturday.length];
            for (int i = 0; i < source.Saturday.length; i++) {
                this.Saturday[i] = new String(source.Saturday[i]);
            }
        }
        if (source.Sunday != null) {
            this.Sunday = new String[source.Sunday.length];
            for (int i = 0; i < source.Sunday.length; i++) {
                this.Sunday[i] = new String(source.Sunday[i]);
            }
        }
        if (source.MaxDelayTime != null) {
            this.MaxDelayTime = new Long(source.MaxDelayTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Monday.", this.Monday);
        this.setParamArraySimple(map, prefix + "Tuesday.", this.Tuesday);
        this.setParamArraySimple(map, prefix + "Wednesday.", this.Wednesday);
        this.setParamArraySimple(map, prefix + "Thursday.", this.Thursday);
        this.setParamArraySimple(map, prefix + "Friday.", this.Friday);
        this.setParamArraySimple(map, prefix + "Saturday.", this.Saturday);
        this.setParamArraySimple(map, prefix + "Sunday.", this.Sunday);
        this.setParamSimple(map, prefix + "MaxDelayTime", this.MaxDelayTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

