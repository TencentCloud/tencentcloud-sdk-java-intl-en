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

public class DescribeDBInstanceParamTplRequest extends AbstractModel {

    /**
    * Parameter template ID. Use the [DescribeDBInstanceParamTpl](https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1) interface to obtain template ID.
    */
    @SerializedName("TplIds")
    @Expose
    private String [] TplIds;

    /**
    * Specifies the template name for query.
    */
    @SerializedName("TplNames")
    @Expose
    private String [] TplNames;

    /**
    * Specifies the database version number of the parameter template to query. For supported versions, use the [DescribeSpecInfo](https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1) API.
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
    private String [] MongoVersion;

    /**
    * Specifies the template type for query.
-DEFAULT: System default template.
-CUSTOMIZE: custom template.
    */
    @SerializedName("TplType")
    @Expose
    private String TplType;

    /**
     * Get Parameter template ID. Use the [DescribeDBInstanceParamTpl](https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1) interface to obtain template ID. 
     * @return TplIds Parameter template ID. Use the [DescribeDBInstanceParamTpl](https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1) interface to obtain template ID.
     */
    public String [] getTplIds() {
        return this.TplIds;
    }

    /**
     * Set Parameter template ID. Use the [DescribeDBInstanceParamTpl](https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1) interface to obtain template ID.
     * @param TplIds Parameter template ID. Use the [DescribeDBInstanceParamTpl](https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1) interface to obtain template ID.
     */
    public void setTplIds(String [] TplIds) {
        this.TplIds = TplIds;
    }

    /**
     * Get Specifies the template name for query. 
     * @return TplNames Specifies the template name for query.
     */
    public String [] getTplNames() {
        return this.TplNames;
    }

    /**
     * Set Specifies the template name for query.
     * @param TplNames Specifies the template name for query.
     */
    public void setTplNames(String [] TplNames) {
        this.TplNames = TplNames;
    }

    /**
     * Get Specifies the database version number of the parameter template to query. For supported versions, use the [DescribeSpecInfo](https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1) API.
- MONGO_36_WT: Version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: Version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: Version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: Version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: Version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
- MONGO_80_WT: version of the MongoDB 8.0 WiredTiger storage engine. 
     * @return MongoVersion Specifies the database version number of the parameter template to query. For supported versions, use the [DescribeSpecInfo](https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1) API.
- MONGO_36_WT: Version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: Version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: Version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: Version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: Version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
- MONGO_80_WT: version of the MongoDB 8.0 WiredTiger storage engine.
     */
    public String [] getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set Specifies the database version number of the parameter template to query. For supported versions, use the [DescribeSpecInfo](https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1) API.
- MONGO_36_WT: Version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: Version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: Version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: Version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: Version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
- MONGO_80_WT: version of the MongoDB 8.0 WiredTiger storage engine.
     * @param MongoVersion Specifies the database version number of the parameter template to query. For supported versions, use the [DescribeSpecInfo](https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1) API.
- MONGO_36_WT: Version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: Version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: Version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: Version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: Version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
- MONGO_80_WT: version of the MongoDB 8.0 WiredTiger storage engine.
     */
    public void setMongoVersion(String [] MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get Specifies the template type for query.
-DEFAULT: System default template.
-CUSTOMIZE: custom template. 
     * @return TplType Specifies the template type for query.
-DEFAULT: System default template.
-CUSTOMIZE: custom template.
     */
    public String getTplType() {
        return this.TplType;
    }

    /**
     * Set Specifies the template type for query.
-DEFAULT: System default template.
-CUSTOMIZE: custom template.
     * @param TplType Specifies the template type for query.
-DEFAULT: System default template.
-CUSTOMIZE: custom template.
     */
    public void setTplType(String TplType) {
        this.TplType = TplType;
    }

    public DescribeDBInstanceParamTplRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceParamTplRequest(DescribeDBInstanceParamTplRequest source) {
        if (source.TplIds != null) {
            this.TplIds = new String[source.TplIds.length];
            for (int i = 0; i < source.TplIds.length; i++) {
                this.TplIds[i] = new String(source.TplIds[i]);
            }
        }
        if (source.TplNames != null) {
            this.TplNames = new String[source.TplNames.length];
            for (int i = 0; i < source.TplNames.length; i++) {
                this.TplNames[i] = new String(source.TplNames[i]);
            }
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String[source.MongoVersion.length];
            for (int i = 0; i < source.MongoVersion.length; i++) {
                this.MongoVersion[i] = new String(source.MongoVersion[i]);
            }
        }
        if (source.TplType != null) {
            this.TplType = new String(source.TplType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TplIds.", this.TplIds);
        this.setParamArraySimple(map, prefix + "TplNames.", this.TplNames);
        this.setParamArraySimple(map, prefix + "MongoVersion.", this.MongoVersion);
        this.setParamSimple(map, prefix + "TplType", this.TplType);

    }
}

