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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamTpl extends AbstractModel {

    /**
    * Parameter template name.
    */
    @SerializedName("TplName")
    @Expose
    private String TplName;

    /**
    * Parameter template ID.
    */
    @SerializedName("TplId")
    @Expose
    private String TplId;

    /**
    * Database versions applicable to the parameter template.
- MONGO_36_WT: Version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: Version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: Version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: Version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: Version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
- MONGO_80_WT: version of the MongoDB 8.0 WiredTiger storage engine.
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * Database type that the parameter template applies to.
- REPLSET: replica set instance.
- SHARD: shard instance.
- STANDALONE: Single-node instance.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Parameter template description.
    */
    @SerializedName("TplDesc")
    @Expose
    private String TplDesc;

    /**
    * Template type.
- DEFAULT: System default template.
- CUSTOMIZE: custom template.
    */
    @SerializedName("TplType")
    @Expose
    private String TplType;

    /**
     * Get Parameter template name. 
     * @return TplName Parameter template name.
     */
    public String getTplName() {
        return this.TplName;
    }

    /**
     * Set Parameter template name.
     * @param TplName Parameter template name.
     */
    public void setTplName(String TplName) {
        this.TplName = TplName;
    }

    /**
     * Get Parameter template ID. 
     * @return TplId Parameter template ID.
     */
    public String getTplId() {
        return this.TplId;
    }

    /**
     * Set Parameter template ID.
     * @param TplId Parameter template ID.
     */
    public void setTplId(String TplId) {
        this.TplId = TplId;
    }

    /**
     * Get Database versions applicable to the parameter template.
- MONGO_36_WT: Version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: Version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: Version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: Version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: Version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
- MONGO_80_WT: version of the MongoDB 8.0 WiredTiger storage engine. 
     * @return MongoVersion Database versions applicable to the parameter template.
- MONGO_36_WT: Version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: Version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: Version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: Version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: Version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
- MONGO_80_WT: version of the MongoDB 8.0 WiredTiger storage engine.
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set Database versions applicable to the parameter template.
- MONGO_36_WT: Version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: Version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: Version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: Version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: Version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
- MONGO_80_WT: version of the MongoDB 8.0 WiredTiger storage engine.
     * @param MongoVersion Database versions applicable to the parameter template.
- MONGO_36_WT: Version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: Version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: Version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: Version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: Version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
- MONGO_80_WT: version of the MongoDB 8.0 WiredTiger storage engine.
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get Database type that the parameter template applies to.
- REPLSET: replica set instance.
- SHARD: shard instance.
- STANDALONE: Single-node instance. 
     * @return ClusterType Database type that the parameter template applies to.
- REPLSET: replica set instance.
- SHARD: shard instance.
- STANDALONE: Single-node instance.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Database type that the parameter template applies to.
- REPLSET: replica set instance.
- SHARD: shard instance.
- STANDALONE: Single-node instance.
     * @param ClusterType Database type that the parameter template applies to.
- REPLSET: replica set instance.
- SHARD: shard instance.
- STANDALONE: Single-node instance.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Parameter template description. 
     * @return TplDesc Parameter template description.
     */
    public String getTplDesc() {
        return this.TplDesc;
    }

    /**
     * Set Parameter template description.
     * @param TplDesc Parameter template description.
     */
    public void setTplDesc(String TplDesc) {
        this.TplDesc = TplDesc;
    }

    /**
     * Get Template type.
- DEFAULT: System default template.
- CUSTOMIZE: custom template. 
     * @return TplType Template type.
- DEFAULT: System default template.
- CUSTOMIZE: custom template.
     */
    public String getTplType() {
        return this.TplType;
    }

    /**
     * Set Template type.
- DEFAULT: System default template.
- CUSTOMIZE: custom template.
     * @param TplType Template type.
- DEFAULT: System default template.
- CUSTOMIZE: custom template.
     */
    public void setTplType(String TplType) {
        this.TplType = TplType;
    }

    public ParamTpl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamTpl(ParamTpl source) {
        if (source.TplName != null) {
            this.TplName = new String(source.TplName);
        }
        if (source.TplId != null) {
            this.TplId = new String(source.TplId);
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String(source.MongoVersion);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.TplDesc != null) {
            this.TplDesc = new String(source.TplDesc);
        }
        if (source.TplType != null) {
            this.TplType = new String(source.TplType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TplName", this.TplName);
        this.setParamSimple(map, prefix + "TplId", this.TplId);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "TplDesc", this.TplDesc);
        this.setParamSimple(map, prefix + "TplType", this.TplType);

    }
}

