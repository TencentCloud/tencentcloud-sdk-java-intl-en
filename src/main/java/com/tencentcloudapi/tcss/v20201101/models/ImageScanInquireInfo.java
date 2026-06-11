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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageScanInquireInfo extends AbstractModel {

    /**
    * Billing item
    */
    @SerializedName("InquireKey")
    @Expose
    private String InquireKey;

    /**
    * Total Capacity
    */
    @SerializedName("Capcity")
    @Expose
    private Long Capcity;

    /**
    * Used amount
    */
    @SerializedName("Useage")
    @Expose
    private Long Useage;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Billing status
Pending purchase
Normal: Normal.
Isolate
    */
    @SerializedName("PurchaseStatus")
    @Expose
    private String PurchaseStatus;

    /**
    * Resource ID
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
    * Number of purchased scans.
    */
    @SerializedName("PayNum")
    @Expose
    private Long PayNum;

    /**
    * Number of trial scans.
    */
    @SerializedName("TrialNum")
    @Expose
    private Long TrialNum;

    /**
    * Number of purchased scanning operations that have been used.
    */
    @SerializedName("PayUsage")
    @Expose
    private Long PayUsage;

    /**
     * Get Billing item 
     * @return InquireKey Billing item
     */
    public String getInquireKey() {
        return this.InquireKey;
    }

    /**
     * Set Billing item
     * @param InquireKey Billing item
     */
    public void setInquireKey(String InquireKey) {
        this.InquireKey = InquireKey;
    }

    /**
     * Get Total Capacity 
     * @return Capcity Total Capacity
     */
    public Long getCapcity() {
        return this.Capcity;
    }

    /**
     * Set Total Capacity
     * @param Capcity Total Capacity
     */
    public void setCapcity(Long Capcity) {
        this.Capcity = Capcity;
    }

    /**
     * Get Used amount 
     * @return Useage Used amount
     */
    public Long getUseage() {
        return this.Useage;
    }

    /**
     * Set Used amount
     * @param Useage Used amount
     */
    public void setUseage(Long Useage) {
        this.Useage = Useage;
    }

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Billing status
Pending purchase
Normal: Normal.
Isolate 
     * @return PurchaseStatus Billing status
Pending purchase
Normal: Normal.
Isolate
     */
    public String getPurchaseStatus() {
        return this.PurchaseStatus;
    }

    /**
     * Set Billing status
Pending purchase
Normal: Normal.
Isolate
     * @param PurchaseStatus Billing status
Pending purchase
Normal: Normal.
Isolate
     */
    public void setPurchaseStatus(String PurchaseStatus) {
        this.PurchaseStatus = PurchaseStatus;
    }

    /**
     * Get Resource ID 
     * @return ResourceID Resource ID
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set Resource ID
     * @param ResourceID Resource ID
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get Number of purchased scans. 
     * @return PayNum Number of purchased scans.
     */
    public Long getPayNum() {
        return this.PayNum;
    }

    /**
     * Set Number of purchased scans.
     * @param PayNum Number of purchased scans.
     */
    public void setPayNum(Long PayNum) {
        this.PayNum = PayNum;
    }

    /**
     * Get Number of trial scans. 
     * @return TrialNum Number of trial scans.
     */
    public Long getTrialNum() {
        return this.TrialNum;
    }

    /**
     * Set Number of trial scans.
     * @param TrialNum Number of trial scans.
     */
    public void setTrialNum(Long TrialNum) {
        this.TrialNum = TrialNum;
    }

    /**
     * Get Number of purchased scanning operations that have been used. 
     * @return PayUsage Number of purchased scanning operations that have been used.
     */
    public Long getPayUsage() {
        return this.PayUsage;
    }

    /**
     * Set Number of purchased scanning operations that have been used.
     * @param PayUsage Number of purchased scanning operations that have been used.
     */
    public void setPayUsage(Long PayUsage) {
        this.PayUsage = PayUsage;
    }

    public ImageScanInquireInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageScanInquireInfo(ImageScanInquireInfo source) {
        if (source.InquireKey != null) {
            this.InquireKey = new String(source.InquireKey);
        }
        if (source.Capcity != null) {
            this.Capcity = new Long(source.Capcity);
        }
        if (source.Useage != null) {
            this.Useage = new Long(source.Useage);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PurchaseStatus != null) {
            this.PurchaseStatus = new String(source.PurchaseStatus);
        }
        if (source.ResourceID != null) {
            this.ResourceID = new String(source.ResourceID);
        }
        if (source.PayNum != null) {
            this.PayNum = new Long(source.PayNum);
        }
        if (source.TrialNum != null) {
            this.TrialNum = new Long(source.TrialNum);
        }
        if (source.PayUsage != null) {
            this.PayUsage = new Long(source.PayUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InquireKey", this.InquireKey);
        this.setParamSimple(map, prefix + "Capcity", this.Capcity);
        this.setParamSimple(map, prefix + "Useage", this.Useage);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PurchaseStatus", this.PurchaseStatus);
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);
        this.setParamSimple(map, prefix + "PayNum", this.PayNum);
        this.setParamSimple(map, prefix + "TrialNum", this.TrialNum);
        this.setParamSimple(map, prefix + "PayUsage", this.PayUsage);

    }
}

