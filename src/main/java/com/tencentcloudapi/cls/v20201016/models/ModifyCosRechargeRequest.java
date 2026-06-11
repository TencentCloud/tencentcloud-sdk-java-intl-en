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

public class ModifyCosRechargeRequest extends AbstractModel {

    /**
    * COS import configuration Id.

-Obtain the cos import configuration Id through the [Get cos import configuration](https://www.tencentcloud.com/document/product/614/88099?from_cn_redirect=1) API.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Log topic Id.

-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * COS import task name, supports up to 128 bytes.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Task status. Valid values: 0: disabled; 1: enabled.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * COS bucket, see the supported [bucket naming conventions](https://www.tencentcloud.com/document/product/436/13312?from_cn_redirect=1).	

-Get COS buckets via [GET Service (List Buckets)](https://www.tencentcloud.com/document/product/436/8291?from_cn_redirect=1).
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * The region where the COS bucket is located, see the supported [region list](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1).
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * Prefix of the folder where COS files are located. When it is an empty string, all files in the bucket will be delivered.
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * Types of logs collected. json_log indicates logs in JSON format; delimiter_log indicates logs in delimiter-separated values format; minimalist_log indicates single-line full-text logs. The default value is minimalist_log.
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Parsing format. Valid values: "", "gzip", "lzop", "snappy". Empty string means no compression.
    */
    @SerializedName("Compress")
    @Expose
    private String Compress;

    /**
    * Extraction rule. If ExtractRule is set, then LogType must be set.
    */
    @SerializedName("ExtractRuleInfo")
    @Expose
    private ExtractRuleInfo ExtractRuleInfo;

    /**
    * COS import task type. Valid values: 1: one-time import task; 2: continuous import task.
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Metadata. Buckets and objects are supported.
    */
    @SerializedName("Metadata")
    @Expose
    private String [] Metadata;

    /**
     * Get COS import configuration Id.

-Obtain the cos import configuration Id through the [Get cos import configuration](https://www.tencentcloud.com/document/product/614/88099?from_cn_redirect=1) API. 
     * @return Id COS import configuration Id.

-Obtain the cos import configuration Id through the [Get cos import configuration](https://www.tencentcloud.com/document/product/614/88099?from_cn_redirect=1) API.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set COS import configuration Id.

-Obtain the cos import configuration Id through the [Get cos import configuration](https://www.tencentcloud.com/document/product/614/88099?from_cn_redirect=1) API.
     * @param Id COS import configuration Id.

-Obtain the cos import configuration Id through the [Get cos import configuration](https://www.tencentcloud.com/document/product/614/88099?from_cn_redirect=1) API.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Log topic Id.

-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). 
     * @return TopicId Log topic Id.

-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic Id.

-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     * @param TopicId Log topic Id.

-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get COS import task name, supports up to 128 bytes. 
     * @return Name COS import task name, supports up to 128 bytes.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set COS import task name, supports up to 128 bytes.
     * @param Name COS import task name, supports up to 128 bytes.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Task status. Valid values: 0: disabled; 1: enabled. 
     * @return Enable Task status. Valid values: 0: disabled; 1: enabled.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Task status. Valid values: 0: disabled; 1: enabled.
     * @param Enable Task status. Valid values: 0: disabled; 1: enabled.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get COS bucket, see the supported [bucket naming conventions](https://www.tencentcloud.com/document/product/436/13312?from_cn_redirect=1).	

-Get COS buckets via [GET Service (List Buckets)](https://www.tencentcloud.com/document/product/436/8291?from_cn_redirect=1). 
     * @return Bucket COS bucket, see the supported [bucket naming conventions](https://www.tencentcloud.com/document/product/436/13312?from_cn_redirect=1).	

-Get COS buckets via [GET Service (List Buckets)](https://www.tencentcloud.com/document/product/436/8291?from_cn_redirect=1).
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS bucket, see the supported [bucket naming conventions](https://www.tencentcloud.com/document/product/436/13312?from_cn_redirect=1).	

-Get COS buckets via [GET Service (List Buckets)](https://www.tencentcloud.com/document/product/436/8291?from_cn_redirect=1).
     * @param Bucket COS bucket, see the supported [bucket naming conventions](https://www.tencentcloud.com/document/product/436/13312?from_cn_redirect=1).	

-Get COS buckets via [GET Service (List Buckets)](https://www.tencentcloud.com/document/product/436/8291?from_cn_redirect=1).
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get The region where the COS bucket is located, see the supported [region list](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1). 
     * @return BucketRegion The region where the COS bucket is located, see the supported [region list](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1).
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set The region where the COS bucket is located, see the supported [region list](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1).
     * @param BucketRegion The region where the COS bucket is located, see the supported [region list](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1).
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get Prefix of the folder where COS files are located. When it is an empty string, all files in the bucket will be delivered. 
     * @return Prefix Prefix of the folder where COS files are located. When it is an empty string, all files in the bucket will be delivered.
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set Prefix of the folder where COS files are located. When it is an empty string, all files in the bucket will be delivered.
     * @param Prefix Prefix of the folder where COS files are located. When it is an empty string, all files in the bucket will be delivered.
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get Types of logs collected. json_log indicates logs in JSON format; delimiter_log indicates logs in delimiter-separated values format; minimalist_log indicates single-line full-text logs. The default value is minimalist_log. 
     * @return LogType Types of logs collected. json_log indicates logs in JSON format; delimiter_log indicates logs in delimiter-separated values format; minimalist_log indicates single-line full-text logs. The default value is minimalist_log.
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Types of logs collected. json_log indicates logs in JSON format; delimiter_log indicates logs in delimiter-separated values format; minimalist_log indicates single-line full-text logs. The default value is minimalist_log.
     * @param LogType Types of logs collected. json_log indicates logs in JSON format; delimiter_log indicates logs in delimiter-separated values format; minimalist_log indicates single-line full-text logs. The default value is minimalist_log.
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Parsing format. Valid values: "", "gzip", "lzop", "snappy". Empty string means no compression. 
     * @return Compress Parsing format. Valid values: "", "gzip", "lzop", "snappy". Empty string means no compression.
     */
    public String getCompress() {
        return this.Compress;
    }

    /**
     * Set Parsing format. Valid values: "", "gzip", "lzop", "snappy". Empty string means no compression.
     * @param Compress Parsing format. Valid values: "", "gzip", "lzop", "snappy". Empty string means no compression.
     */
    public void setCompress(String Compress) {
        this.Compress = Compress;
    }

    /**
     * Get Extraction rule. If ExtractRule is set, then LogType must be set. 
     * @return ExtractRuleInfo Extraction rule. If ExtractRule is set, then LogType must be set.
     */
    public ExtractRuleInfo getExtractRuleInfo() {
        return this.ExtractRuleInfo;
    }

    /**
     * Set Extraction rule. If ExtractRule is set, then LogType must be set.
     * @param ExtractRuleInfo Extraction rule. If ExtractRule is set, then LogType must be set.
     */
    public void setExtractRuleInfo(ExtractRuleInfo ExtractRuleInfo) {
        this.ExtractRuleInfo = ExtractRuleInfo;
    }

    /**
     * Get COS import task type. Valid values: 1: one-time import task; 2: continuous import task. 
     * @return TaskType COS import task type. Valid values: 1: one-time import task; 2: continuous import task.
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set COS import task type. Valid values: 1: one-time import task; 2: continuous import task.
     * @param TaskType COS import task type. Valid values: 1: one-time import task; 2: continuous import task.
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Metadata. Buckets and objects are supported. 
     * @return Metadata Metadata. Buckets and objects are supported.
     */
    public String [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set Metadata. Buckets and objects are supported.
     * @param Metadata Metadata. Buckets and objects are supported.
     */
    public void setMetadata(String [] Metadata) {
        this.Metadata = Metadata;
    }

    public ModifyCosRechargeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCosRechargeRequest(ModifyCosRechargeRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
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
        if (source.Compress != null) {
            this.Compress = new String(source.Compress);
        }
        if (source.ExtractRuleInfo != null) {
            this.ExtractRuleInfo = new ExtractRuleInfo(source.ExtractRuleInfo);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.Metadata != null) {
            this.Metadata = new String[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new String(source.Metadata[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamObj(map, prefix + "ExtractRuleInfo.", this.ExtractRuleInfo);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "Metadata.", this.Metadata);

    }
}

