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

public class CreateDBInstanceParamTplRequest extends AbstractModel {

    /**
    * Parameter template name.
    */
    @SerializedName("TplName")
    @Expose
    private String TplName;

    /**
    * Template version number. This field is required when **MirrorTplId** is empty. For the purchasable versions supported by the parameter template, use the interface [DescribeSpecInfo](https://www.tencentcloud.com/document/product/240/34701).
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
    * Instance type. This parameter is required when MirrorTplId is empty.
- REPLSET: replica set instance.
- SHARD: shard instance.
-STANDALONE: Single-node instance.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Template description information.
    */
    @SerializedName("TplDesc")
    @Expose
    private String TplDesc;

    /**
    * Template parameter. If this parameter is not configured, the system default template is used as the version parameter.
    */
    @SerializedName("Params")
    @Expose
    private ParamType [] Params;

    /**
    * Image template ID. If an image template is specified, a new template is cloned from this template.
**Note**: When MirrorTplId is not empty, MongoVersion and ClusterType will follow the template version and instance type of MirrorTpl.
    */
    @SerializedName("MirrorTplId")
    @Expose
    private String MirrorTplId;

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
     * Get Template version number. This field is required when **MirrorTplId** is empty. For the purchasable versions supported by the parameter template, use the interface [DescribeSpecInfo](https://www.tencentcloud.com/document/product/240/34701).
- MONGO_36_WT: Version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: Version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: Version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: Version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: Version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
- MONGO_80_WT: version of the MongoDB 8.0 WiredTiger storage engine. 
     * @return MongoVersion Template version number. This field is required when **MirrorTplId** is empty. For the purchasable versions supported by the parameter template, use the interface [DescribeSpecInfo](https://www.tencentcloud.com/document/product/240/34701).
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
     * Set Template version number. This field is required when **MirrorTplId** is empty. For the purchasable versions supported by the parameter template, use the interface [DescribeSpecInfo](https://www.tencentcloud.com/document/product/240/34701).
- MONGO_36_WT: Version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: Version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: Version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: Version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: Version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
- MONGO_80_WT: version of the MongoDB 8.0 WiredTiger storage engine.
     * @param MongoVersion Template version number. This field is required when **MirrorTplId** is empty. For the purchasable versions supported by the parameter template, use the interface [DescribeSpecInfo](https://www.tencentcloud.com/document/product/240/34701).
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
     * Get Instance type. This parameter is required when MirrorTplId is empty.
- REPLSET: replica set instance.
- SHARD: shard instance.
-STANDALONE: Single-node instance. 
     * @return ClusterType Instance type. This parameter is required when MirrorTplId is empty.
- REPLSET: replica set instance.
- SHARD: shard instance.
-STANDALONE: Single-node instance.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Instance type. This parameter is required when MirrorTplId is empty.
- REPLSET: replica set instance.
- SHARD: shard instance.
-STANDALONE: Single-node instance.
     * @param ClusterType Instance type. This parameter is required when MirrorTplId is empty.
- REPLSET: replica set instance.
- SHARD: shard instance.
-STANDALONE: Single-node instance.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Template description information. 
     * @return TplDesc Template description information.
     */
    public String getTplDesc() {
        return this.TplDesc;
    }

    /**
     * Set Template description information.
     * @param TplDesc Template description information.
     */
    public void setTplDesc(String TplDesc) {
        this.TplDesc = TplDesc;
    }

    /**
     * Get Template parameter. If this parameter is not configured, the system default template is used as the version parameter. 
     * @return Params Template parameter. If this parameter is not configured, the system default template is used as the version parameter.
     */
    public ParamType [] getParams() {
        return this.Params;
    }

    /**
     * Set Template parameter. If this parameter is not configured, the system default template is used as the version parameter.
     * @param Params Template parameter. If this parameter is not configured, the system default template is used as the version parameter.
     */
    public void setParams(ParamType [] Params) {
        this.Params = Params;
    }

    /**
     * Get Image template ID. If an image template is specified, a new template is cloned from this template.
**Note**: When MirrorTplId is not empty, MongoVersion and ClusterType will follow the template version and instance type of MirrorTpl. 
     * @return MirrorTplId Image template ID. If an image template is specified, a new template is cloned from this template.
**Note**: When MirrorTplId is not empty, MongoVersion and ClusterType will follow the template version and instance type of MirrorTpl.
     */
    public String getMirrorTplId() {
        return this.MirrorTplId;
    }

    /**
     * Set Image template ID. If an image template is specified, a new template is cloned from this template.
**Note**: When MirrorTplId is not empty, MongoVersion and ClusterType will follow the template version and instance type of MirrorTpl.
     * @param MirrorTplId Image template ID. If an image template is specified, a new template is cloned from this template.
**Note**: When MirrorTplId is not empty, MongoVersion and ClusterType will follow the template version and instance type of MirrorTpl.
     */
    public void setMirrorTplId(String MirrorTplId) {
        this.MirrorTplId = MirrorTplId;
    }

    public CreateDBInstanceParamTplRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBInstanceParamTplRequest(CreateDBInstanceParamTplRequest source) {
        if (source.TplName != null) {
            this.TplName = new String(source.TplName);
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
        if (source.Params != null) {
            this.Params = new ParamType[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new ParamType(source.Params[i]);
            }
        }
        if (source.MirrorTplId != null) {
            this.MirrorTplId = new String(source.MirrorTplId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TplName", this.TplName);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "TplDesc", this.TplDesc);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamSimple(map, prefix + "MirrorTplId", this.MirrorTplId);

    }
}

