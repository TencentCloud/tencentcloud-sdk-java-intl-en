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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Partition extends AbstractModel {

    /**
    * Partition type:
●Range: The partition column is usually of time or integer type. Four writing methods are supported.
●List: The partition value is an enumeration value.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PartitionType")
    @Expose
    private String PartitionType;

    /**
    * Whether to automatically partition

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoPartition")
    @Expose
    private Boolean AutoPartition;

    /**
    * Partition information when the partition type is Range

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RangeInfos")
    @Expose
    private RangeInfo [] RangeInfos;

    /**
    * Partition information when the partition type is List

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListInfos")
    @Expose
    private ListInfo [] ListInfos;

    /**
     * Get Partition type:
●Range: The partition column is usually of time or integer type. Four writing methods are supported.
●List: The partition value is an enumeration value.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PartitionType Partition type:
●Range: The partition column is usually of time or integer type. Four writing methods are supported.
●List: The partition value is an enumeration value.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPartitionType() {
        return this.PartitionType;
    }

    /**
     * Set Partition type:
●Range: The partition column is usually of time or integer type. Four writing methods are supported.
●List: The partition value is an enumeration value.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param PartitionType Partition type:
●Range: The partition column is usually of time or integer type. Four writing methods are supported.
●List: The partition value is an enumeration value.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitionType(String PartitionType) {
        this.PartitionType = PartitionType;
    }

    /**
     * Get Whether to automatically partition

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoPartition Whether to automatically partition

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAutoPartition() {
        return this.AutoPartition;
    }

    /**
     * Set Whether to automatically partition

Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoPartition Whether to automatically partition

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoPartition(Boolean AutoPartition) {
        this.AutoPartition = AutoPartition;
    }

    /**
     * Get Partition information when the partition type is Range

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RangeInfos Partition information when the partition type is Range

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RangeInfo [] getRangeInfos() {
        return this.RangeInfos;
    }

    /**
     * Set Partition information when the partition type is Range

Note: This field may return null, indicating that no valid values can be obtained.
     * @param RangeInfos Partition information when the partition type is Range

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRangeInfos(RangeInfo [] RangeInfos) {
        this.RangeInfos = RangeInfos;
    }

    /**
     * Get Partition information when the partition type is List

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ListInfos Partition information when the partition type is List

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ListInfo [] getListInfos() {
        return this.ListInfos;
    }

    /**
     * Set Partition information when the partition type is List

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ListInfos Partition information when the partition type is List

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setListInfos(ListInfo [] ListInfos) {
        this.ListInfos = ListInfos;
    }

    public Partition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Partition(Partition source) {
        if (source.PartitionType != null) {
            this.PartitionType = new String(source.PartitionType);
        }
        if (source.AutoPartition != null) {
            this.AutoPartition = new Boolean(source.AutoPartition);
        }
        if (source.RangeInfos != null) {
            this.RangeInfos = new RangeInfo[source.RangeInfos.length];
            for (int i = 0; i < source.RangeInfos.length; i++) {
                this.RangeInfos[i] = new RangeInfo(source.RangeInfos[i]);
            }
        }
        if (source.ListInfos != null) {
            this.ListInfos = new ListInfo[source.ListInfos.length];
            for (int i = 0; i < source.ListInfos.length; i++) {
                this.ListInfos[i] = new ListInfo(source.ListInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionType", this.PartitionType);
        this.setParamSimple(map, prefix + "AutoPartition", this.AutoPartition);
        this.setParamArrayObj(map, prefix + "RangeInfos.", this.RangeInfos);
        this.setParamArrayObj(map, prefix + "ListInfos.", this.ListInfos);

    }
}

