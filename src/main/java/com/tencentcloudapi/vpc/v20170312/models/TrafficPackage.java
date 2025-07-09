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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficPackage extends AbstractModel {

    /**
    * Unique traffic package ID
    */
    @SerializedName("TrafficPackageId")
    @Expose
    private String TrafficPackageId;

    /**
    * Traffic package name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TrafficPackageName")
    @Expose
    private String TrafficPackageName;

    /**
    * Traffic package size in GB
    */
    @SerializedName("TotalAmount")
    @Expose
    private Float TotalAmount;

    /**
    * Traffic package balance in GB
    */
    @SerializedName("RemainingAmount")
    @Expose
    private Float RemainingAmount;

    /**
    * Traffic package status. Valid values: `AVAILABLE`, `EXPIRED`, `EXHAUSTED`, `REFUNDED`, `DELETED`
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Traffic package creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Traffic package expiration time
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * Used traffic in GB
    */
    @SerializedName("UsedAmount")
    @Expose
    private Float UsedAmount;

    /**
    * Traffic package tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * Traffic package type (idle-time or full-time)
    */
    @SerializedName("DeductType")
    @Expose
    private String DeductType;

    /**
     * Get Unique traffic package ID 
     * @return TrafficPackageId Unique traffic package ID
     */
    public String getTrafficPackageId() {
        return this.TrafficPackageId;
    }

    /**
     * Set Unique traffic package ID
     * @param TrafficPackageId Unique traffic package ID
     */
    public void setTrafficPackageId(String TrafficPackageId) {
        this.TrafficPackageId = TrafficPackageId;
    }

    /**
     * Get Traffic package name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TrafficPackageName Traffic package name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTrafficPackageName() {
        return this.TrafficPackageName;
    }

    /**
     * Set Traffic package name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TrafficPackageName Traffic package name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTrafficPackageName(String TrafficPackageName) {
        this.TrafficPackageName = TrafficPackageName;
    }

    /**
     * Get Traffic package size in GB 
     * @return TotalAmount Traffic package size in GB
     */
    public Float getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set Traffic package size in GB
     * @param TotalAmount Traffic package size in GB
     */
    public void setTotalAmount(Float TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get Traffic package balance in GB 
     * @return RemainingAmount Traffic package balance in GB
     */
    public Float getRemainingAmount() {
        return this.RemainingAmount;
    }

    /**
     * Set Traffic package balance in GB
     * @param RemainingAmount Traffic package balance in GB
     */
    public void setRemainingAmount(Float RemainingAmount) {
        this.RemainingAmount = RemainingAmount;
    }

    /**
     * Get Traffic package status. Valid values: `AVAILABLE`, `EXPIRED`, `EXHAUSTED`, `REFUNDED`, `DELETED` 
     * @return Status Traffic package status. Valid values: `AVAILABLE`, `EXPIRED`, `EXHAUSTED`, `REFUNDED`, `DELETED`
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Traffic package status. Valid values: `AVAILABLE`, `EXPIRED`, `EXHAUSTED`, `REFUNDED`, `DELETED`
     * @param Status Traffic package status. Valid values: `AVAILABLE`, `EXPIRED`, `EXHAUSTED`, `REFUNDED`, `DELETED`
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Traffic package creation time 
     * @return CreatedTime Traffic package creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Traffic package creation time
     * @param CreatedTime Traffic package creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Traffic package expiration time 
     * @return Deadline Traffic package expiration time
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set Traffic package expiration time
     * @param Deadline Traffic package expiration time
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get Used traffic in GB 
     * @return UsedAmount Used traffic in GB
     */
    public Float getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set Used traffic in GB
     * @param UsedAmount Used traffic in GB
     */
    public void setUsedAmount(Float UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get Traffic package tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagSet Traffic package tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Traffic package tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagSet Traffic package tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Traffic package type (idle-time or full-time) 
     * @return DeductType Traffic package type (idle-time or full-time)
     */
    public String getDeductType() {
        return this.DeductType;
    }

    /**
     * Set Traffic package type (idle-time or full-time)
     * @param DeductType Traffic package type (idle-time or full-time)
     */
    public void setDeductType(String DeductType) {
        this.DeductType = DeductType;
    }

    public TrafficPackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficPackage(TrafficPackage source) {
        if (source.TrafficPackageId != null) {
            this.TrafficPackageId = new String(source.TrafficPackageId);
        }
        if (source.TrafficPackageName != null) {
            this.TrafficPackageName = new String(source.TrafficPackageName);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new Float(source.TotalAmount);
        }
        if (source.RemainingAmount != null) {
            this.RemainingAmount = new Float(source.RemainingAmount);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
        if (source.UsedAmount != null) {
            this.UsedAmount = new Float(source.UsedAmount);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.DeductType != null) {
            this.DeductType = new String(source.DeductType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficPackageId", this.TrafficPackageId);
        this.setParamSimple(map, prefix + "TrafficPackageName", this.TrafficPackageName);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "RemainingAmount", this.RemainingAmount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "UsedAmount", this.UsedAmount);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "DeductType", this.DeductType);

    }
}

