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

public class CreateCosRechargeRequest extends AbstractModel{

    /**
    * ID of the log topic.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * ID of the logset.
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Shipping task name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * COS bucket.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Region where the COS bucket is located.
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * The prefix of the folder where COS files are located.
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * The type of log collected. `json_log`: JSON logs; `delimiter_log`: separator logs; `minimalist_log`: full text in a single line
Default value: `minimalist_log`
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Valid values: "" (default), "gzip", "lzop", "snappy"
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
     * Get ID of the log topic. 
     * @return TopicId ID of the log topic.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set ID of the log topic.
     * @param TopicId ID of the log topic.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get ID of the logset. 
     * @return LogsetId ID of the logset.
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set ID of the logset.
     * @param LogsetId ID of the logset.
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Shipping task name. 
     * @return Name Shipping task name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Shipping task name.
     * @param Name Shipping task name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get COS bucket. 
     * @return Bucket COS bucket.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS bucket.
     * @param Bucket COS bucket.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Region where the COS bucket is located. 
     * @return BucketRegion Region where the COS bucket is located.
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set Region where the COS bucket is located.
     * @param BucketRegion Region where the COS bucket is located.
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get The prefix of the folder where COS files are located. 
     * @return Prefix The prefix of the folder where COS files are located.
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set The prefix of the folder where COS files are located.
     * @param Prefix The prefix of the folder where COS files are located.
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
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
     * Get Valid values: "" (default), "gzip", "lzop", "snappy" 
     * @return Compress Valid values: "" (default), "gzip", "lzop", "snappy"
     */
    public String getCompress() {
        return this.Compress;
    }

    /**
     * Set Valid values: "" (default), "gzip", "lzop", "snappy"
     * @param Compress Valid values: "" (default), "gzip", "lzop", "snappy"
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
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamObj(map, prefix + "ExtractRuleInfo.", this.ExtractRuleInfo);

    }
}

