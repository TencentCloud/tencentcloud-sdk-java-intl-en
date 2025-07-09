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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectType extends AbstractModel {

    /**
    * Object type ID
    */
    @SerializedName("ObjectTypeId")
    @Expose
    private Long ObjectTypeId;

    /**
    * Object type name
    */
    @SerializedName("ObjectTypeTitle")
    @Expose
    private String ObjectTypeTitle;

    /**
    * Level-1 object type
    */
    @SerializedName("ObjectTypeLevelOne")
    @Expose
    private String ObjectTypeLevelOne;

    /**
    * Object type parameters
    */
    @SerializedName("ObjectTypeParams")
    @Expose
    private ObjectTypeConfig ObjectTypeParams;

    /**
    * JSON parsing rule for TKE APIs. If the value is null, no parsing is needed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectTypeJsonParse")
    @Expose
    private ObjectTypeJsonParse ObjectTypeJsonParse;

    /**
    * Whether new action is included
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectHasNewAction")
    @Expose
    private Boolean ObjectHasNewAction;

    /**
     * Get Object type ID 
     * @return ObjectTypeId Object type ID
     */
    public Long getObjectTypeId() {
        return this.ObjectTypeId;
    }

    /**
     * Set Object type ID
     * @param ObjectTypeId Object type ID
     */
    public void setObjectTypeId(Long ObjectTypeId) {
        this.ObjectTypeId = ObjectTypeId;
    }

    /**
     * Get Object type name 
     * @return ObjectTypeTitle Object type name
     */
    public String getObjectTypeTitle() {
        return this.ObjectTypeTitle;
    }

    /**
     * Set Object type name
     * @param ObjectTypeTitle Object type name
     */
    public void setObjectTypeTitle(String ObjectTypeTitle) {
        this.ObjectTypeTitle = ObjectTypeTitle;
    }

    /**
     * Get Level-1 object type 
     * @return ObjectTypeLevelOne Level-1 object type
     */
    public String getObjectTypeLevelOne() {
        return this.ObjectTypeLevelOne;
    }

    /**
     * Set Level-1 object type
     * @param ObjectTypeLevelOne Level-1 object type
     */
    public void setObjectTypeLevelOne(String ObjectTypeLevelOne) {
        this.ObjectTypeLevelOne = ObjectTypeLevelOne;
    }

    /**
     * Get Object type parameters 
     * @return ObjectTypeParams Object type parameters
     */
    public ObjectTypeConfig getObjectTypeParams() {
        return this.ObjectTypeParams;
    }

    /**
     * Set Object type parameters
     * @param ObjectTypeParams Object type parameters
     */
    public void setObjectTypeParams(ObjectTypeConfig ObjectTypeParams) {
        this.ObjectTypeParams = ObjectTypeParams;
    }

    /**
     * Get JSON parsing rule for TKE APIs. If the value is null, no parsing is needed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectTypeJsonParse JSON parsing rule for TKE APIs. If the value is null, no parsing is needed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ObjectTypeJsonParse getObjectTypeJsonParse() {
        return this.ObjectTypeJsonParse;
    }

    /**
     * Set JSON parsing rule for TKE APIs. If the value is null, no parsing is needed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectTypeJsonParse JSON parsing rule for TKE APIs. If the value is null, no parsing is needed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectTypeJsonParse(ObjectTypeJsonParse ObjectTypeJsonParse) {
        this.ObjectTypeJsonParse = ObjectTypeJsonParse;
    }

    /**
     * Get Whether new action is included
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectHasNewAction Whether new action is included
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getObjectHasNewAction() {
        return this.ObjectHasNewAction;
    }

    /**
     * Set Whether new action is included
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectHasNewAction Whether new action is included
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectHasNewAction(Boolean ObjectHasNewAction) {
        this.ObjectHasNewAction = ObjectHasNewAction;
    }

    public ObjectType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectType(ObjectType source) {
        if (source.ObjectTypeId != null) {
            this.ObjectTypeId = new Long(source.ObjectTypeId);
        }
        if (source.ObjectTypeTitle != null) {
            this.ObjectTypeTitle = new String(source.ObjectTypeTitle);
        }
        if (source.ObjectTypeLevelOne != null) {
            this.ObjectTypeLevelOne = new String(source.ObjectTypeLevelOne);
        }
        if (source.ObjectTypeParams != null) {
            this.ObjectTypeParams = new ObjectTypeConfig(source.ObjectTypeParams);
        }
        if (source.ObjectTypeJsonParse != null) {
            this.ObjectTypeJsonParse = new ObjectTypeJsonParse(source.ObjectTypeJsonParse);
        }
        if (source.ObjectHasNewAction != null) {
            this.ObjectHasNewAction = new Boolean(source.ObjectHasNewAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectTypeId", this.ObjectTypeId);
        this.setParamSimple(map, prefix + "ObjectTypeTitle", this.ObjectTypeTitle);
        this.setParamSimple(map, prefix + "ObjectTypeLevelOne", this.ObjectTypeLevelOne);
        this.setParamObj(map, prefix + "ObjectTypeParams.", this.ObjectTypeParams);
        this.setParamObj(map, prefix + "ObjectTypeJsonParse.", this.ObjectTypeJsonParse);
        this.setParamSimple(map, prefix + "ObjectHasNewAction", this.ObjectHasNewAction);

    }
}

