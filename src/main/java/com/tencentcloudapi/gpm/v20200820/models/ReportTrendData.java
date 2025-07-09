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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportTrendData extends AbstractModel {

    /**
    * Total count
    */
    @SerializedName("TotalList")
    @Expose
    private String [] TotalList;

    /**
    * Number of requests cancelled
    */
    @SerializedName("CancelList")
    @Expose
    private String [] CancelList;

    /**
    * Number of successes
    */
    @SerializedName("SuccessList")
    @Expose
    private String [] SuccessList;

    /**
    * Number of failures
    */
    @SerializedName("FailList")
    @Expose
    private String [] FailList;

    /**
    * Number of request timeout
    */
    @SerializedName("TimeoutList")
    @Expose
    private String [] TimeoutList;

    /**
    * Time array in seconds
    */
    @SerializedName("TimeList")
    @Expose
    private String [] TimeList;

    /**
     * Get Total count 
     * @return TotalList Total count
     */
    public String [] getTotalList() {
        return this.TotalList;
    }

    /**
     * Set Total count
     * @param TotalList Total count
     */
    public void setTotalList(String [] TotalList) {
        this.TotalList = TotalList;
    }

    /**
     * Get Number of requests cancelled 
     * @return CancelList Number of requests cancelled
     */
    public String [] getCancelList() {
        return this.CancelList;
    }

    /**
     * Set Number of requests cancelled
     * @param CancelList Number of requests cancelled
     */
    public void setCancelList(String [] CancelList) {
        this.CancelList = CancelList;
    }

    /**
     * Get Number of successes 
     * @return SuccessList Number of successes
     */
    public String [] getSuccessList() {
        return this.SuccessList;
    }

    /**
     * Set Number of successes
     * @param SuccessList Number of successes
     */
    public void setSuccessList(String [] SuccessList) {
        this.SuccessList = SuccessList;
    }

    /**
     * Get Number of failures 
     * @return FailList Number of failures
     */
    public String [] getFailList() {
        return this.FailList;
    }

    /**
     * Set Number of failures
     * @param FailList Number of failures
     */
    public void setFailList(String [] FailList) {
        this.FailList = FailList;
    }

    /**
     * Get Number of request timeout 
     * @return TimeoutList Number of request timeout
     */
    public String [] getTimeoutList() {
        return this.TimeoutList;
    }

    /**
     * Set Number of request timeout
     * @param TimeoutList Number of request timeout
     */
    public void setTimeoutList(String [] TimeoutList) {
        this.TimeoutList = TimeoutList;
    }

    /**
     * Get Time array in seconds 
     * @return TimeList Time array in seconds
     */
    public String [] getTimeList() {
        return this.TimeList;
    }

    /**
     * Set Time array in seconds
     * @param TimeList Time array in seconds
     */
    public void setTimeList(String [] TimeList) {
        this.TimeList = TimeList;
    }

    public ReportTrendData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportTrendData(ReportTrendData source) {
        if (source.TotalList != null) {
            this.TotalList = new String[source.TotalList.length];
            for (int i = 0; i < source.TotalList.length; i++) {
                this.TotalList[i] = new String(source.TotalList[i]);
            }
        }
        if (source.CancelList != null) {
            this.CancelList = new String[source.CancelList.length];
            for (int i = 0; i < source.CancelList.length; i++) {
                this.CancelList[i] = new String(source.CancelList[i]);
            }
        }
        if (source.SuccessList != null) {
            this.SuccessList = new String[source.SuccessList.length];
            for (int i = 0; i < source.SuccessList.length; i++) {
                this.SuccessList[i] = new String(source.SuccessList[i]);
            }
        }
        if (source.FailList != null) {
            this.FailList = new String[source.FailList.length];
            for (int i = 0; i < source.FailList.length; i++) {
                this.FailList[i] = new String(source.FailList[i]);
            }
        }
        if (source.TimeoutList != null) {
            this.TimeoutList = new String[source.TimeoutList.length];
            for (int i = 0; i < source.TimeoutList.length; i++) {
                this.TimeoutList[i] = new String(source.TimeoutList[i]);
            }
        }
        if (source.TimeList != null) {
            this.TimeList = new String[source.TimeList.length];
            for (int i = 0; i < source.TimeList.length; i++) {
                this.TimeList[i] = new String(source.TimeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TotalList.", this.TotalList);
        this.setParamArraySimple(map, prefix + "CancelList.", this.CancelList);
        this.setParamArraySimple(map, prefix + "SuccessList.", this.SuccessList);
        this.setParamArraySimple(map, prefix + "FailList.", this.FailList);
        this.setParamArraySimple(map, prefix + "TimeoutList.", this.TimeoutList);
        this.setParamArraySimple(map, prefix + "TimeList.", this.TimeList);

    }
}

