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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareObject extends AbstractModel {

    /**
    * Data comparison object mode (`all`: Entire instance; `partial`: Some objects)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectMode")
    @Expose
    private String ObjectMode;

    /**
    * Object list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectItems")
    @Expose
    private CompareObjectItem [] ObjectItems;

    /**
    * Advanced object types, such as account, index, shardkey, schema.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdvancedObjects")
    @Expose
    private String [] AdvancedObjects;

    /**
     * Get Data comparison object mode (`all`: Entire instance; `partial`: Some objects)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectMode Data comparison object mode (`all`: Entire instance; `partial`: Some objects)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getObjectMode() {
        return this.ObjectMode;
    }

    /**
     * Set Data comparison object mode (`all`: Entire instance; `partial`: Some objects)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectMode Data comparison object mode (`all`: Entire instance; `partial`: Some objects)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectMode(String ObjectMode) {
        this.ObjectMode = ObjectMode;
    }

    /**
     * Get Object list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectItems Object list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CompareObjectItem [] getObjectItems() {
        return this.ObjectItems;
    }

    /**
     * Set Object list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectItems Object list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectItems(CompareObjectItem [] ObjectItems) {
        this.ObjectItems = ObjectItems;
    }

    /**
     * Get Advanced object types, such as account, index, shardkey, schema.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AdvancedObjects Advanced object types, such as account, index, shardkey, schema.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAdvancedObjects() {
        return this.AdvancedObjects;
    }

    /**
     * Set Advanced object types, such as account, index, shardkey, schema.Note: This field may return null, indicating that no valid values can be obtained.
     * @param AdvancedObjects Advanced object types, such as account, index, shardkey, schema.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAdvancedObjects(String [] AdvancedObjects) {
        this.AdvancedObjects = AdvancedObjects;
    }

    public CompareObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareObject(CompareObject source) {
        if (source.ObjectMode != null) {
            this.ObjectMode = new String(source.ObjectMode);
        }
        if (source.ObjectItems != null) {
            this.ObjectItems = new CompareObjectItem[source.ObjectItems.length];
            for (int i = 0; i < source.ObjectItems.length; i++) {
                this.ObjectItems[i] = new CompareObjectItem(source.ObjectItems[i]);
            }
        }
        if (source.AdvancedObjects != null) {
            this.AdvancedObjects = new String[source.AdvancedObjects.length];
            for (int i = 0; i < source.AdvancedObjects.length; i++) {
                this.AdvancedObjects[i] = new String(source.AdvancedObjects[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectMode", this.ObjectMode);
        this.setParamArrayObj(map, prefix + "ObjectItems.", this.ObjectItems);
        this.setParamArraySimple(map, prefix + "AdvancedObjects.", this.AdvancedObjects);

    }
}

