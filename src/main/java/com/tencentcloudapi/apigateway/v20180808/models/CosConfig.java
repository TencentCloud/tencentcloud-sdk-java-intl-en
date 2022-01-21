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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosConfig extends AbstractModel{

    /**
    * Specifies how the backend COS bucket is called by the API. The frontend request method and Action can be:
GET：GetObject
PUT：PutObject
POST：PostObject、AppendObject
HEAD： HeadObject
DELETE： DeleteObject
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Backend COS bucket of the API
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * Whether to enable the backend COS signature for the API. It defaults to `false`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Authorization")
    @Expose
    private Boolean Authorization;

    /**
     * Get Specifies how the backend COS bucket is called by the API. The frontend request method and Action can be:
GET：GetObject
PUT：PutObject
POST：PostObject、AppendObject
HEAD： HeadObject
DELETE： DeleteObject
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Action Specifies how the backend COS bucket is called by the API. The frontend request method and Action can be:
GET：GetObject
PUT：PutObject
POST：PostObject、AppendObject
HEAD： HeadObject
DELETE： DeleteObject
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Specifies how the backend COS bucket is called by the API. The frontend request method and Action can be:
GET：GetObject
PUT：PutObject
POST：PostObject、AppendObject
HEAD： HeadObject
DELETE： DeleteObject
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Action Specifies how the backend COS bucket is called by the API. The frontend request method and Action can be:
GET：GetObject
PUT：PutObject
POST：PostObject、AppendObject
HEAD： HeadObject
DELETE： DeleteObject
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Backend COS bucket of the API
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return BucketName Backend COS bucket of the API
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Backend COS bucket of the API
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param BucketName Backend COS bucket of the API
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get Whether to enable the backend COS signature for the API. It defaults to `false`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Authorization Whether to enable the backend COS signature for the API. It defaults to `false`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getAuthorization() {
        return this.Authorization;
    }

    /**
     * Set Whether to enable the backend COS signature for the API. It defaults to `false`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Authorization Whether to enable the backend COS signature for the API. It defaults to `false`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAuthorization(Boolean Authorization) {
        this.Authorization = Authorization;
    }

    public CosConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosConfig(CosConfig source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Authorization != null) {
            this.Authorization = new Boolean(source.Authorization);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "Authorization", this.Authorization);

    }
}

