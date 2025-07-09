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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyShipperRequest extends AbstractModel {

    /**
    * Shipping rule ID
    */
    @SerializedName("ShipperId")
    @Expose
    private String ShipperId;

    /**
    * New destination bucket in shipping rule
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * New destination directory prefix in shipping rule
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * Shipping rule status
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * Shipping rule name
    */
    @SerializedName("ShipperName")
    @Expose
    private String ShipperName;

    /**
    * Shipping time interval in seconds. Default value: 300. Value range: 300 to 900
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Maximum size of a file to be shipped, in MB. Default value: 256. Value range: 5 to 256
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * Filter rules for shipped logs. Only logs matching the rules can be shipped. All rules are in the AND relationship, and up to five rules can be added. If the array is empty, no filtering will be performed, and all logs will be shipped.
    */
    @SerializedName("FilterRules")
    @Expose
    private FilterRuleInfo [] FilterRules;

    /**
    * Partition rule of shipped log, which can be represented in `strftime` time format
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * Compression configuration of shipped log
    */
    @SerializedName("Compress")
    @Expose
    private CompressInfo Compress;

    /**
    * Format configuration of shipped log content
    */
    @SerializedName("Content")
    @Expose
    private ContentInfo Content;

    /**
    * Naming a shipping file. Valid values: `0` (by random number), `1` (by shipping time). Default value: `0`.
    */
    @SerializedName("FilenameMode")
    @Expose
    private Long FilenameMode;

    /**
    * COS bucket type
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get Shipping rule ID 
     * @return ShipperId Shipping rule ID
     */
    public String getShipperId() {
        return this.ShipperId;
    }

    /**
     * Set Shipping rule ID
     * @param ShipperId Shipping rule ID
     */
    public void setShipperId(String ShipperId) {
        this.ShipperId = ShipperId;
    }

    /**
     * Get New destination bucket in shipping rule 
     * @return Bucket New destination bucket in shipping rule
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set New destination bucket in shipping rule
     * @param Bucket New destination bucket in shipping rule
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get New destination directory prefix in shipping rule 
     * @return Prefix New destination directory prefix in shipping rule
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set New destination directory prefix in shipping rule
     * @param Prefix New destination directory prefix in shipping rule
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get Shipping rule status 
     * @return Status Shipping rule status
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Shipping rule status
     * @param Status Shipping rule status
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get Shipping rule name 
     * @return ShipperName Shipping rule name
     */
    public String getShipperName() {
        return this.ShipperName;
    }

    /**
     * Set Shipping rule name
     * @param ShipperName Shipping rule name
     */
    public void setShipperName(String ShipperName) {
        this.ShipperName = ShipperName;
    }

    /**
     * Get Shipping time interval in seconds. Default value: 300. Value range: 300 to 900 
     * @return Interval Shipping time interval in seconds. Default value: 300. Value range: 300 to 900
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Shipping time interval in seconds. Default value: 300. Value range: 300 to 900
     * @param Interval Shipping time interval in seconds. Default value: 300. Value range: 300 to 900
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Maximum size of a file to be shipped, in MB. Default value: 256. Value range: 5 to 256 
     * @return MaxSize Maximum size of a file to be shipped, in MB. Default value: 256. Value range: 5 to 256
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Maximum size of a file to be shipped, in MB. Default value: 256. Value range: 5 to 256
     * @param MaxSize Maximum size of a file to be shipped, in MB. Default value: 256. Value range: 5 to 256
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get Filter rules for shipped logs. Only logs matching the rules can be shipped. All rules are in the AND relationship, and up to five rules can be added. If the array is empty, no filtering will be performed, and all logs will be shipped. 
     * @return FilterRules Filter rules for shipped logs. Only logs matching the rules can be shipped. All rules are in the AND relationship, and up to five rules can be added. If the array is empty, no filtering will be performed, and all logs will be shipped.
     */
    public FilterRuleInfo [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set Filter rules for shipped logs. Only logs matching the rules can be shipped. All rules are in the AND relationship, and up to five rules can be added. If the array is empty, no filtering will be performed, and all logs will be shipped.
     * @param FilterRules Filter rules for shipped logs. Only logs matching the rules can be shipped. All rules are in the AND relationship, and up to five rules can be added. If the array is empty, no filtering will be performed, and all logs will be shipped.
     */
    public void setFilterRules(FilterRuleInfo [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    /**
     * Get Partition rule of shipped log, which can be represented in `strftime` time format 
     * @return Partition Partition rule of shipped log, which can be represented in `strftime` time format
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition rule of shipped log, which can be represented in `strftime` time format
     * @param Partition Partition rule of shipped log, which can be represented in `strftime` time format
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Compression configuration of shipped log 
     * @return Compress Compression configuration of shipped log
     */
    public CompressInfo getCompress() {
        return this.Compress;
    }

    /**
     * Set Compression configuration of shipped log
     * @param Compress Compression configuration of shipped log
     */
    public void setCompress(CompressInfo Compress) {
        this.Compress = Compress;
    }

    /**
     * Get Format configuration of shipped log content 
     * @return Content Format configuration of shipped log content
     */
    public ContentInfo getContent() {
        return this.Content;
    }

    /**
     * Set Format configuration of shipped log content
     * @param Content Format configuration of shipped log content
     */
    public void setContent(ContentInfo Content) {
        this.Content = Content;
    }

    /**
     * Get Naming a shipping file. Valid values: `0` (by random number), `1` (by shipping time). Default value: `0`. 
     * @return FilenameMode Naming a shipping file. Valid values: `0` (by random number), `1` (by shipping time). Default value: `0`.
     */
    public Long getFilenameMode() {
        return this.FilenameMode;
    }

    /**
     * Set Naming a shipping file. Valid values: `0` (by random number), `1` (by shipping time). Default value: `0`.
     * @param FilenameMode Naming a shipping file. Valid values: `0` (by random number), `1` (by shipping time). Default value: `0`.
     */
    public void setFilenameMode(Long FilenameMode) {
        this.FilenameMode = FilenameMode;
    }

    /**
     * Get COS bucket type 
     * @return StorageType COS bucket type
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set COS bucket type
     * @param StorageType COS bucket type
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public ModifyShipperRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyShipperRequest(ModifyShipperRequest source) {
        if (source.ShipperId != null) {
            this.ShipperId = new String(source.ShipperId);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.ShipperName != null) {
            this.ShipperName = new String(source.ShipperName);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.FilterRules != null) {
            this.FilterRules = new FilterRuleInfo[source.FilterRules.length];
            for (int i = 0; i < source.FilterRules.length; i++) {
                this.FilterRules[i] = new FilterRuleInfo(source.FilterRules[i]);
            }
        }
        if (source.Partition != null) {
            this.Partition = new String(source.Partition);
        }
        if (source.Compress != null) {
            this.Compress = new CompressInfo(source.Compress);
        }
        if (source.Content != null) {
            this.Content = new ContentInfo(source.Content);
        }
        if (source.FilenameMode != null) {
            this.FilenameMode = new Long(source.FilenameMode);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShipperId", this.ShipperId);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ShipperName", this.ShipperName);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamArrayObj(map, prefix + "FilterRules.", this.FilterRules);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamObj(map, prefix + "Compress.", this.Compress);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "FilenameMode", this.FilenameMode);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

