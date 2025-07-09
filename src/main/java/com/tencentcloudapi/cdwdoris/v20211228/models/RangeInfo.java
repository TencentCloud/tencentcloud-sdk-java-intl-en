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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RangeInfo extends AbstractModel {

    /**
    * Range partition type:
●FIXED: Define the left closed and right open interval of the partition.
●LESS THAN: Only define the upper bound of the partition.
●BATCH RANGE: Batch create RANGE partitions of numeric and time types, define the left closed and right open intervals of the partitions, and set the step size.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RangeType")
    @Expose
    private String RangeType;

    /**
    * Partition name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * The left-closed interval of each partition column when RangeType is FIXED or BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Left")
    @Expose
    private String Left;

    /**
    * The right open interval of each partition column when RangeType is FIXED or BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Right")
    @Expose
    private String Right;

    /**
    * The upper bound of each partition column when RangeType is LESS THAN

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
    * RangeType is the step size of BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepLength")
    @Expose
    private Long StepLength;

    /**
    * Fill it in when RangeType is BATCH RANGE or automatic partitioning. It indicates the step size unit when the partition column is of time type.
●YEAR: year
●MONTH: month
●WEEK: week
●DAY: day

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
     * Get Range partition type:
●FIXED: Define the left closed and right open interval of the partition.
●LESS THAN: Only define the upper bound of the partition.
●BATCH RANGE: Batch create RANGE partitions of numeric and time types, define the left closed and right open intervals of the partitions, and set the step size.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RangeType Range partition type:
●FIXED: Define the left closed and right open interval of the partition.
●LESS THAN: Only define the upper bound of the partition.
●BATCH RANGE: Batch create RANGE partitions of numeric and time types, define the left closed and right open intervals of the partitions, and set the step size.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRangeType() {
        return this.RangeType;
    }

    /**
     * Set Range partition type:
●FIXED: Define the left closed and right open interval of the partition.
●LESS THAN: Only define the upper bound of the partition.
●BATCH RANGE: Batch create RANGE partitions of numeric and time types, define the left closed and right open intervals of the partitions, and set the step size.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param RangeType Range partition type:
●FIXED: Define the left closed and right open interval of the partition.
●LESS THAN: Only define the upper bound of the partition.
●BATCH RANGE: Batch create RANGE partitions of numeric and time types, define the left closed and right open intervals of the partitions, and set the step size.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRangeType(String RangeType) {
        this.RangeType = RangeType;
    }

    /**
     * Get Partition name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PartitionName Partition name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set Partition name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PartitionName Partition name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
    }

    /**
     * Get The left-closed interval of each partition column when RangeType is FIXED or BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Left The left-closed interval of each partition column when RangeType is FIXED or BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLeft() {
        return this.Left;
    }

    /**
     * Set The left-closed interval of each partition column when RangeType is FIXED or BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Left The left-closed interval of each partition column when RangeType is FIXED or BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLeft(String Left) {
        this.Left = Left;
    }

    /**
     * Get The right open interval of each partition column when RangeType is FIXED or BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Right The right open interval of each partition column when RangeType is FIXED or BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRight() {
        return this.Right;
    }

    /**
     * Set The right open interval of each partition column when RangeType is FIXED or BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Right The right open interval of each partition column when RangeType is FIXED or BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRight(String Right) {
        this.Right = Right;
    }

    /**
     * Get The upper bound of each partition column when RangeType is LESS THAN

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Max The upper bound of each partition column when RangeType is LESS THAN

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set The upper bound of each partition column when RangeType is LESS THAN

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Max The upper bound of each partition column when RangeType is LESS THAN

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Get RangeType is the step size of BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepLength RangeType is the step size of BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStepLength() {
        return this.StepLength;
    }

    /**
     * Set RangeType is the step size of BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepLength RangeType is the step size of BATCH RANGE

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepLength(Long StepLength) {
        this.StepLength = StepLength;
    }

    /**
     * Get Fill it in when RangeType is BATCH RANGE or automatic partitioning. It indicates the step size unit when the partition column is of time type.
●YEAR: year
●MONTH: month
●WEEK: week
●DAY: day

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Unit Fill it in when RangeType is BATCH RANGE or automatic partitioning. It indicates the step size unit when the partition column is of time type.
●YEAR: year
●MONTH: month
●WEEK: week
●DAY: day

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Fill it in when RangeType is BATCH RANGE or automatic partitioning. It indicates the step size unit when the partition column is of time type.
●YEAR: year
●MONTH: month
●WEEK: week
●DAY: day

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Unit Fill it in when RangeType is BATCH RANGE or automatic partitioning. It indicates the step size unit when the partition column is of time type.
●YEAR: year
●MONTH: month
●WEEK: week
●DAY: day

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public RangeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RangeInfo(RangeInfo source) {
        if (source.RangeType != null) {
            this.RangeType = new String(source.RangeType);
        }
        if (source.PartitionName != null) {
            this.PartitionName = new String(source.PartitionName);
        }
        if (source.Left != null) {
            this.Left = new String(source.Left);
        }
        if (source.Right != null) {
            this.Right = new String(source.Right);
        }
        if (source.Max != null) {
            this.Max = new String(source.Max);
        }
        if (source.StepLength != null) {
            this.StepLength = new Long(source.StepLength);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RangeType", this.RangeType);
        this.setParamSimple(map, prefix + "PartitionName", this.PartitionName);
        this.setParamSimple(map, prefix + "Left", this.Left);
        this.setParamSimple(map, prefix + "Right", this.Right);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "StepLength", this.StepLength);
        this.setParamSimple(map, prefix + "Unit", this.Unit);

    }
}

