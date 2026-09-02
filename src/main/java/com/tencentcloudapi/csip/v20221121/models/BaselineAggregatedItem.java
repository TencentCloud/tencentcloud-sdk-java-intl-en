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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineAggregatedItem extends AbstractModel {

    /**
    * <p>Basic detection item information (including ID, name, risk level, category, etc.).</p>
    */
    @SerializedName("Item")
    @Expose
    private BaselineItem Item;

    /**
    * <p>Number of assets with a PASS result in the last scan for this detection item.</p>
    */
    @SerializedName("PassAssetCount")
    @Expose
    private Long PassAssetCount;

    /**
    * <p>Number of assets with result NOT_PASS in the last scan of this detection item.</p>
    */
    @SerializedName("NotPassAssetCount")
    @Expose
    private Long NotPassAssetCount;

    /**
    * <p>Number of assets with the last scan result of PASS, NOT_PASS, and CHECKING for this detection item.</p>
    */
    @SerializedName("TotalAssetCount")
    @Expose
    private Long TotalAssetCount;

    /**
    * <p>Pass rate of assets in the last scan of this detection item, unit: percentage (0–100).</p>
    */
    @SerializedName("PassRate")
    @Expose
    private Float PassRate;

    /**
    * <p>The last time the scan for this detection item was completed.</p>
    */
    @SerializedName("LatestCheckTime")
    @Expose
    private String LatestCheckTime;

    /**
    * <p>Status of the last scan result. Parameter Value:</p><ul><li>CHECKING: in-progress detection</li><li>PASS: passed</li><li>NOT_PASS: failed</li><li>CHECK_FAILED: detection failed</li><li>NOT_INVOLVED: not involved</li></ul>
    */
    @SerializedName("ResultStatus")
    @Expose
    private String ResultStatus;

    /**
    * <p>Tenant Appid list involved in the aggregation result.</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long [] Appid;

    /**
    * <p>List of scan JobIDs involved in this aggregation result.</p>
    */
    @SerializedName("JobID")
    @Expose
    private String [] JobID;

    /**
     * Get <p>Basic detection item information (including ID, name, risk level, category, etc.).</p> 
     * @return Item <p>Basic detection item information (including ID, name, risk level, category, etc.).</p>
     */
    public BaselineItem getItem() {
        return this.Item;
    }

    /**
     * Set <p>Basic detection item information (including ID, name, risk level, category, etc.).</p>
     * @param Item <p>Basic detection item information (including ID, name, risk level, category, etc.).</p>
     */
    public void setItem(BaselineItem Item) {
        this.Item = Item;
    }

    /**
     * Get <p>Number of assets with a PASS result in the last scan for this detection item.</p> 
     * @return PassAssetCount <p>Number of assets with a PASS result in the last scan for this detection item.</p>
     */
    public Long getPassAssetCount() {
        return this.PassAssetCount;
    }

    /**
     * Set <p>Number of assets with a PASS result in the last scan for this detection item.</p>
     * @param PassAssetCount <p>Number of assets with a PASS result in the last scan for this detection item.</p>
     */
    public void setPassAssetCount(Long PassAssetCount) {
        this.PassAssetCount = PassAssetCount;
    }

    /**
     * Get <p>Number of assets with result NOT_PASS in the last scan of this detection item.</p> 
     * @return NotPassAssetCount <p>Number of assets with result NOT_PASS in the last scan of this detection item.</p>
     */
    public Long getNotPassAssetCount() {
        return this.NotPassAssetCount;
    }

    /**
     * Set <p>Number of assets with result NOT_PASS in the last scan of this detection item.</p>
     * @param NotPassAssetCount <p>Number of assets with result NOT_PASS in the last scan of this detection item.</p>
     */
    public void setNotPassAssetCount(Long NotPassAssetCount) {
        this.NotPassAssetCount = NotPassAssetCount;
    }

    /**
     * Get <p>Number of assets with the last scan result of PASS, NOT_PASS, and CHECKING for this detection item.</p> 
     * @return TotalAssetCount <p>Number of assets with the last scan result of PASS, NOT_PASS, and CHECKING for this detection item.</p>
     */
    public Long getTotalAssetCount() {
        return this.TotalAssetCount;
    }

    /**
     * Set <p>Number of assets with the last scan result of PASS, NOT_PASS, and CHECKING for this detection item.</p>
     * @param TotalAssetCount <p>Number of assets with the last scan result of PASS, NOT_PASS, and CHECKING for this detection item.</p>
     */
    public void setTotalAssetCount(Long TotalAssetCount) {
        this.TotalAssetCount = TotalAssetCount;
    }

    /**
     * Get <p>Pass rate of assets in the last scan of this detection item, unit: percentage (0–100).</p> 
     * @return PassRate <p>Pass rate of assets in the last scan of this detection item, unit: percentage (0–100).</p>
     */
    public Float getPassRate() {
        return this.PassRate;
    }

    /**
     * Set <p>Pass rate of assets in the last scan of this detection item, unit: percentage (0–100).</p>
     * @param PassRate <p>Pass rate of assets in the last scan of this detection item, unit: percentage (0–100).</p>
     */
    public void setPassRate(Float PassRate) {
        this.PassRate = PassRate;
    }

    /**
     * Get <p>The last time the scan for this detection item was completed.</p> 
     * @return LatestCheckTime <p>The last time the scan for this detection item was completed.</p>
     */
    public String getLatestCheckTime() {
        return this.LatestCheckTime;
    }

    /**
     * Set <p>The last time the scan for this detection item was completed.</p>
     * @param LatestCheckTime <p>The last time the scan for this detection item was completed.</p>
     */
    public void setLatestCheckTime(String LatestCheckTime) {
        this.LatestCheckTime = LatestCheckTime;
    }

    /**
     * Get <p>Status of the last scan result. Parameter Value:</p><ul><li>CHECKING: in-progress detection</li><li>PASS: passed</li><li>NOT_PASS: failed</li><li>CHECK_FAILED: detection failed</li><li>NOT_INVOLVED: not involved</li></ul> 
     * @return ResultStatus <p>Status of the last scan result. Parameter Value:</p><ul><li>CHECKING: in-progress detection</li><li>PASS: passed</li><li>NOT_PASS: failed</li><li>CHECK_FAILED: detection failed</li><li>NOT_INVOLVED: not involved</li></ul>
     */
    public String getResultStatus() {
        return this.ResultStatus;
    }

    /**
     * Set <p>Status of the last scan result. Parameter Value:</p><ul><li>CHECKING: in-progress detection</li><li>PASS: passed</li><li>NOT_PASS: failed</li><li>CHECK_FAILED: detection failed</li><li>NOT_INVOLVED: not involved</li></ul>
     * @param ResultStatus <p>Status of the last scan result. Parameter Value:</p><ul><li>CHECKING: in-progress detection</li><li>PASS: passed</li><li>NOT_PASS: failed</li><li>CHECK_FAILED: detection failed</li><li>NOT_INVOLVED: not involved</li></ul>
     */
    public void setResultStatus(String ResultStatus) {
        this.ResultStatus = ResultStatus;
    }

    /**
     * Get <p>Tenant Appid list involved in the aggregation result.</p> 
     * @return Appid <p>Tenant Appid list involved in the aggregation result.</p>
     */
    public Long [] getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>Tenant Appid list involved in the aggregation result.</p>
     * @param Appid <p>Tenant Appid list involved in the aggregation result.</p>
     */
    public void setAppid(Long [] Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>List of scan JobIDs involved in this aggregation result.</p> 
     * @return JobID <p>List of scan JobIDs involved in this aggregation result.</p>
     */
    public String [] getJobID() {
        return this.JobID;
    }

    /**
     * Set <p>List of scan JobIDs involved in this aggregation result.</p>
     * @param JobID <p>List of scan JobIDs involved in this aggregation result.</p>
     */
    public void setJobID(String [] JobID) {
        this.JobID = JobID;
    }

    public BaselineAggregatedItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineAggregatedItem(BaselineAggregatedItem source) {
        if (source.Item != null) {
            this.Item = new BaselineItem(source.Item);
        }
        if (source.PassAssetCount != null) {
            this.PassAssetCount = new Long(source.PassAssetCount);
        }
        if (source.NotPassAssetCount != null) {
            this.NotPassAssetCount = new Long(source.NotPassAssetCount);
        }
        if (source.TotalAssetCount != null) {
            this.TotalAssetCount = new Long(source.TotalAssetCount);
        }
        if (source.PassRate != null) {
            this.PassRate = new Float(source.PassRate);
        }
        if (source.LatestCheckTime != null) {
            this.LatestCheckTime = new String(source.LatestCheckTime);
        }
        if (source.ResultStatus != null) {
            this.ResultStatus = new String(source.ResultStatus);
        }
        if (source.Appid != null) {
            this.Appid = new Long[source.Appid.length];
            for (int i = 0; i < source.Appid.length; i++) {
                this.Appid[i] = new Long(source.Appid[i]);
            }
        }
        if (source.JobID != null) {
            this.JobID = new String[source.JobID.length];
            for (int i = 0; i < source.JobID.length; i++) {
                this.JobID[i] = new String(source.JobID[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Item.", this.Item);
        this.setParamSimple(map, prefix + "PassAssetCount", this.PassAssetCount);
        this.setParamSimple(map, prefix + "NotPassAssetCount", this.NotPassAssetCount);
        this.setParamSimple(map, prefix + "TotalAssetCount", this.TotalAssetCount);
        this.setParamSimple(map, prefix + "PassRate", this.PassRate);
        this.setParamSimple(map, prefix + "LatestCheckTime", this.LatestCheckTime);
        this.setParamSimple(map, prefix + "ResultStatus", this.ResultStatus);
        this.setParamArraySimple(map, prefix + "Appid.", this.Appid);
        this.setParamArraySimple(map, prefix + "JobID.", this.JobID);

    }
}

