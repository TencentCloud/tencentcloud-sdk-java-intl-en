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

public class CreateCosRechargeRequest extends AbstractModel {

    /**
    * Log topic Id.

-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * FL instance set ID.

-Obtain the logset Id by searching the [logset list](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1).
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * COS import task name, supports up to 128 bytes.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * COS bucket, see the supported [bucket naming conventions](https://www.tencentcloud.com/document/product/436/13312?from_cn_redirect=1).	

-Get COS buckets via [GET Service (List Buckets)](https://www.tencentcloud.com/document/product/436/8291?from_cn_redirect=1).
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * The region where the COS bucket is located, see the supported [region list](https://intl.cloud.tencent.com/document/product/436/6224?from_cn_redirect=1).
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * The type of log collected. `json_log`: JSON logs; `delimiter_log`: separator logs; `minimalist_log`: full text in a single line
Default value: `minimalist_log`
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * The prefix of the folder where COS files are located. By default, it is null, meaning that all files under the bucket will be shipped.
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * Valid values: supported: "", "gzip", "lzop", "snappy"; Default value: ""; no compression.
    */
    @SerializedName("Compress")
    @Expose
    private String Compress;

    /**
    * Extraction rule. If `ExtractRule` is set, `LogType` must be set.
    */
    @SerializedName("ExtractRuleInfo")
    @Expose
    private ExtractRuleInfo ExtractRuleInfo;

    /**
    * COS import task type. Valid values: 1: one-time import task (default value); 2: continuous import task.
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Metadata.
    */
    @SerializedName("Metadata")
    @Expose
    private String [] Metadata;

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
     * Get FL instance set ID.

-Obtain the logset Id by searching the [logset list](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1). 
     * @return LogsetId FL instance set ID.

-Obtain the logset Id by searching the [logset list](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1).
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set FL instance set ID.

-Obtain the logset Id by searching the [logset list](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1).
     * @param LogsetId FL instance set ID.

-Obtain the logset Id by searching the [logset list](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1).
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
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
     * Get The region where the COS bucket is located, see the supported [region list](https://intl.cloud.tencent.com/document/product/436/6224?from_cn_redirect=1). 
     * @return BucketRegion The region where the COS bucket is located, see the supported [region list](https://intl.cloud.tencent.com/document/product/436/6224?from_cn_redirect=1).
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set The region where the COS bucket is located, see the supported [region list](https://intl.cloud.tencent.com/document/product/436/6224?from_cn_redirect=1).
     * @param BucketRegion The region where the COS bucket is located, see the supported [region list](https://intl.cloud.tencent.com/document/product/436/6224?from_cn_redirect=1).
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get The type of log collected. `json_log`: JSON logs; `delimiter_log`: separator logs; `minimalist_log`: full text in a single line
Default value: `minimalist_log` 
     * @return LogType The type of log collected. `json_log`: JSON logs; `delimiter_log`: separator logs; `minimalist_log`: full text in a single line
Default value: `minimalist_log`
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set The type of log collected. `json_log`: JSON logs; `delimiter_log`: separator logs; `minimalist_log`: full text in a single line
Default value: `minimalist_log`
     * @param LogType The type of log collected. `json_log`: JSON logs; `delimiter_log`: separator logs; `minimalist_log`: full text in a single line
Default value: `minimalist_log`
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get The prefix of the folder where COS files are located. By default, it is null, meaning that all files under the bucket will be shipped. 
     * @return Prefix The prefix of the folder where COS files are located. By default, it is null, meaning that all files under the bucket will be shipped.
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set The prefix of the folder where COS files are located. By default, it is null, meaning that all files under the bucket will be shipped.
     * @param Prefix The prefix of the folder where COS files are located. By default, it is null, meaning that all files under the bucket will be shipped.
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get Valid values: supported: "", "gzip", "lzop", "snappy"; Default value: ""; no compression. 
     * @return Compress Valid values: supported: "", "gzip", "lzop", "snappy"; Default value: ""; no compression.
     */
    public String getCompress() {
        return this.Compress;
    }

    /**
     * Set Valid values: supported: "", "gzip", "lzop", "snappy"; Default value: ""; no compression.
     * @param Compress Valid values: supported: "", "gzip", "lzop", "snappy"; Default value: ""; no compression.
     */
    public void setCompress(String Compress) {
        this.Compress = Compress;
    }

    /**
     * Get Extraction rule. If `ExtractRule` is set, `LogType` must be set. 
     * @return ExtractRuleInfo Extraction rule. If `ExtractRule` is set, `LogType` must be set.
     */
    public ExtractRuleInfo getExtractRuleInfo() {
        return this.ExtractRuleInfo;
    }

    /**
     * Set Extraction rule. If `ExtractRule` is set, `LogType` must be set.
     * @param ExtractRuleInfo Extraction rule. If `ExtractRule` is set, `LogType` must be set.
     */
    public void setExtractRuleInfo(ExtractRuleInfo ExtractRuleInfo) {
        this.ExtractRuleInfo = ExtractRuleInfo;
    }

    /**
     * Get COS import task type. Valid values: 1: one-time import task (default value); 2: continuous import task. 
     * @return TaskType COS import task type. Valid values: 1: one-time import task (default value); 2: continuous import task.
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set COS import task type. Valid values: 1: one-time import task (default value); 2: continuous import task.
     * @param TaskType COS import task type. Valid values: 1: one-time import task (default value); 2: continuous import task.
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Metadata. 
     * @return Metadata Metadata.
     */
    public String [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set Metadata.
     * @param Metadata Metadata.
     */
    public void setMetadata(String [] Metadata) {
        this.Metadata = Metadata;
    }

    public CreateCosRechargeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCosRechargeRequest(CreateCosRechargeRequest source) {
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
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
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
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamObj(map, prefix + "ExtractRuleInfo.", this.ExtractRuleInfo);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "Metadata.", this.Metadata);

    }
}

