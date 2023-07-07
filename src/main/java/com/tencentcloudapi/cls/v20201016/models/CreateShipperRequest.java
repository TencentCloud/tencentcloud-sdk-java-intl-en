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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateShipperRequest extends AbstractModel{

    /**
    * ID of the log topic to which the shipping rule to be created belongs
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Destination bucket in the shipping rule to be created
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Prefix of the shipping directory in the shipping rule to be created
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * Shipping rule name
    */
    @SerializedName("ShipperName")
    @Expose
    private String ShipperName;

    /**
    * Interval between shipping tasks (in sec). Default value: 300. Value range: 300-900
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Maximum size of a file to be shipped, in MB. Default value: 256. Value range: 100-256
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
    * Rules for partitioning logs to be shipped. `strftime` can be used to define the presentation of time format.
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
    * Naming a shipping file. Valid values: `0` (by random number); `1` (by shipping time). Default value: `0`.
    */
    @SerializedName("FilenameMode")
    @Expose
    private Long FilenameMode;

    /**
    * Start time for data shipping, which cannot be earlier than the lifecycle start time of the log topic. If you do not specify this parameter, it will be set to the time when you create the data shipping task.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time for data shipping, which cannot be set to a future time. If you do not specify this parameter, it indicates continuous data shipping.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get ID of the log topic to which the shipping rule to be created belongs 
     * @return TopicId ID of the log topic to which the shipping rule to be created belongs
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set ID of the log topic to which the shipping rule to be created belongs
     * @param TopicId ID of the log topic to which the shipping rule to be created belongs
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Destination bucket in the shipping rule to be created 
     * @return Bucket Destination bucket in the shipping rule to be created
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Destination bucket in the shipping rule to be created
     * @param Bucket Destination bucket in the shipping rule to be created
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Prefix of the shipping directory in the shipping rule to be created 
     * @return Prefix Prefix of the shipping directory in the shipping rule to be created
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set Prefix of the shipping directory in the shipping rule to be created
     * @param Prefix Prefix of the shipping directory in the shipping rule to be created
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
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
     * Get Interval between shipping tasks (in sec). Default value: 300. Value range: 300-900 
     * @return Interval Interval between shipping tasks (in sec). Default value: 300. Value range: 300-900
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Interval between shipping tasks (in sec). Default value: 300. Value range: 300-900
     * @param Interval Interval between shipping tasks (in sec). Default value: 300. Value range: 300-900
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Maximum size of a file to be shipped, in MB. Default value: 256. Value range: 100-256 
     * @return MaxSize Maximum size of a file to be shipped, in MB. Default value: 256. Value range: 100-256
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Maximum size of a file to be shipped, in MB. Default value: 256. Value range: 100-256
     * @param MaxSize Maximum size of a file to be shipped, in MB. Default value: 256. Value range: 100-256
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
     * Get Rules for partitioning logs to be shipped. `strftime` can be used to define the presentation of time format. 
     * @return Partition Rules for partitioning logs to be shipped. `strftime` can be used to define the presentation of time format.
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set Rules for partitioning logs to be shipped. `strftime` can be used to define the presentation of time format.
     * @param Partition Rules for partitioning logs to be shipped. `strftime` can be used to define the presentation of time format.
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
     * Get Naming a shipping file. Valid values: `0` (by random number); `1` (by shipping time). Default value: `0`. 
     * @return FilenameMode Naming a shipping file. Valid values: `0` (by random number); `1` (by shipping time). Default value: `0`.
     */
    public Long getFilenameMode() {
        return this.FilenameMode;
    }

    /**
     * Set Naming a shipping file. Valid values: `0` (by random number); `1` (by shipping time). Default value: `0`.
     * @param FilenameMode Naming a shipping file. Valid values: `0` (by random number); `1` (by shipping time). Default value: `0`.
     */
    public void setFilenameMode(Long FilenameMode) {
        this.FilenameMode = FilenameMode;
    }

    /**
     * Get Start time for data shipping, which cannot be earlier than the lifecycle start time of the log topic. If you do not specify this parameter, it will be set to the time when you create the data shipping task. 
     * @return StartTime Start time for data shipping, which cannot be earlier than the lifecycle start time of the log topic. If you do not specify this parameter, it will be set to the time when you create the data shipping task.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time for data shipping, which cannot be earlier than the lifecycle start time of the log topic. If you do not specify this parameter, it will be set to the time when you create the data shipping task.
     * @param StartTime Start time for data shipping, which cannot be earlier than the lifecycle start time of the log topic. If you do not specify this parameter, it will be set to the time when you create the data shipping task.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time for data shipping, which cannot be set to a future time. If you do not specify this parameter, it indicates continuous data shipping. 
     * @return EndTime End time for data shipping, which cannot be set to a future time. If you do not specify this parameter, it indicates continuous data shipping.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time for data shipping, which cannot be set to a future time. If you do not specify this parameter, it indicates continuous data shipping.
     * @param EndTime End time for data shipping, which cannot be set to a future time. If you do not specify this parameter, it indicates continuous data shipping.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public CreateShipperRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateShipperRequest(CreateShipperRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
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
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "ShipperName", this.ShipperName);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamArrayObj(map, prefix + "FilterRules.", this.FilterRules);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamObj(map, prefix + "Compress.", this.Compress);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "FilenameMode", this.FilenameMode);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

