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

public class CosRechargeInfo extends AbstractModel{

    /**
    * COS import configuration ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * ID of the log topic.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * ID of the logset.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * COS import task name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * COS bucket.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * COS bucket region.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * The prefix of the folder where COS files are located.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * The type of log collected. `json_log`: JSON logs; `delimiter_log`: separator logs; `minimalist_log`: full text in a single line
Default value: `minimalist_log`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Status. `0`: Created, `1`: Running, `2`: Stopped, `3`: Completed, `4`: Run failed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Progress in percentage.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Valid values: "" (default), "gzip", "lzop", "snappy"
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Compress")
    @Expose
    private String Compress;

    /**
    * See the description of the `ExtractRuleInfo` structure.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtractRuleInfo")
    @Expose
    private ExtractRuleInfo ExtractRuleInfo;

    /**
     * Get COS import configuration ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id COS import configuration ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set COS import configuration ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id COS import configuration ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get ID of the log topic.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicId ID of the log topic.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set ID of the log topic.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicId ID of the log topic.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get ID of the logset.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogsetId ID of the logset.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set ID of the logset.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogsetId ID of the logset.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get COS import task name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name COS import task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set COS import task name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name COS import task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get COS bucket.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Bucket COS bucket.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS bucket.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Bucket COS bucket.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get COS bucket region.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BucketRegion COS bucket region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set COS bucket region.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BucketRegion COS bucket region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get The prefix of the folder where COS files are located.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Prefix The prefix of the folder where COS files are located.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set The prefix of the folder where COS files are located.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Prefix The prefix of the folder where COS files are located.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get The type of log collected. `json_log`: JSON logs; `delimiter_log`: separator logs; `minimalist_log`: full text in a single line
Default value: `minimalist_log`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogType The type of log collected. `json_log`: JSON logs; `delimiter_log`: separator logs; `minimalist_log`: full text in a single line
Default value: `minimalist_log`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set The type of log collected. `json_log`: JSON logs; `delimiter_log`: separator logs; `minimalist_log`: full text in a single line
Default value: `minimalist_log`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogType The type of log collected. `json_log`: JSON logs; `delimiter_log`: separator logs; `minimalist_log`: full text in a single line
Default value: `minimalist_log`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Status. `0`: Created, `1`: Running, `2`: Stopped, `3`: Completed, `4`: Run failed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status. `0`: Created, `1`: Running, `2`: Stopped, `3`: Completed, `4`: Run failed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. `0`: Created, `1`: Running, `2`: Stopped, `3`: Completed, `4`: Run failed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status. `0`: Created, `1`: Running, `2`: Stopped, `3`: Completed, `4`: Run failed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enable Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enable Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Progress in percentage.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Progress Progress in percentage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Progress in percentage.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Progress Progress in percentage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Valid values: "" (default), "gzip", "lzop", "snappy"
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Compress Valid values: "" (default), "gzip", "lzop", "snappy"
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCompress() {
        return this.Compress;
    }

    /**
     * Set Valid values: "" (default), "gzip", "lzop", "snappy"
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Compress Valid values: "" (default), "gzip", "lzop", "snappy"
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompress(String Compress) {
        this.Compress = Compress;
    }

    /**
     * Get See the description of the `ExtractRuleInfo` structure.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtractRuleInfo See the description of the `ExtractRuleInfo` structure.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExtractRuleInfo getExtractRuleInfo() {
        return this.ExtractRuleInfo;
    }

    /**
     * Set See the description of the `ExtractRuleInfo` structure.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtractRuleInfo See the description of the `ExtractRuleInfo` structure.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtractRuleInfo(ExtractRuleInfo ExtractRuleInfo) {
        this.ExtractRuleInfo = ExtractRuleInfo;
    }

    public CosRechargeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosRechargeInfo(CosRechargeInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Compress != null) {
            this.Compress = new String(source.Compress);
        }
        if (source.ExtractRuleInfo != null) {
            this.ExtractRuleInfo = new ExtractRuleInfo(source.ExtractRuleInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamObj(map, prefix + "ExtractRuleInfo.", this.ExtractRuleInfo);

    }
}

