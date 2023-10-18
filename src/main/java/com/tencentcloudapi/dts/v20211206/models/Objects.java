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

public class Objects extends AbstractModel {

    /**
    * Sync object type. Valid value: `Partial` (Partial objects). Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Sync object, which is required if `Mode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Databases")
    @Expose
    private Database [] Databases;

    /**
    * Advanced object type, such as functions and procedures. If you need to sync advanced objects, the initialization type must include structure initialization, that is, `Options.InitType` must be `Structure` or `Full`. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdvancedObjects")
    @Expose
    private String [] AdvancedObjects;

    /**
    * A redundant field that specifies the online DDL type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OnlineDDL")
    @Expose
    private OnlineDDL OnlineDDL;

    /**
     * Get Sync object type. Valid value: `Partial` (Partial objects). Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mode Sync object type. Valid value: `Partial` (Partial objects). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Sync object type. Valid value: `Partial` (Partial objects). Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mode Sync object type. Valid value: `Partial` (Partial objects). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Sync object, which is required if `Mode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Databases Sync object, which is required if `Mode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Database [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set Sync object, which is required if `Mode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Databases Sync object, which is required if `Mode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabases(Database [] Databases) {
        this.Databases = Databases;
    }

    /**
     * Get Advanced object type, such as functions and procedures. If you need to sync advanced objects, the initialization type must include structure initialization, that is, `Options.InitType` must be `Structure` or `Full`. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AdvancedObjects Advanced object type, such as functions and procedures. If you need to sync advanced objects, the initialization type must include structure initialization, that is, `Options.InitType` must be `Structure` or `Full`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAdvancedObjects() {
        return this.AdvancedObjects;
    }

    /**
     * Set Advanced object type, such as functions and procedures. If you need to sync advanced objects, the initialization type must include structure initialization, that is, `Options.InitType` must be `Structure` or `Full`. Note: This field may return null, indicating that no valid values can be obtained.
     * @param AdvancedObjects Advanced object type, such as functions and procedures. If you need to sync advanced objects, the initialization type must include structure initialization, that is, `Options.InitType` must be `Structure` or `Full`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAdvancedObjects(String [] AdvancedObjects) {
        this.AdvancedObjects = AdvancedObjects;
    }

    /**
     * Get A redundant field that specifies the online DDL type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OnlineDDL A redundant field that specifies the online DDL type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public OnlineDDL getOnlineDDL() {
        return this.OnlineDDL;
    }

    /**
     * Set A redundant field that specifies the online DDL type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OnlineDDL A redundant field that specifies the online DDL type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOnlineDDL(OnlineDDL OnlineDDL) {
        this.OnlineDDL = OnlineDDL;
    }

    public Objects() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Objects(Objects source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Databases != null) {
            this.Databases = new Database[source.Databases.length];
            for (int i = 0; i < source.Databases.length; i++) {
                this.Databases[i] = new Database(source.Databases[i]);
            }
        }
        if (source.AdvancedObjects != null) {
            this.AdvancedObjects = new String[source.AdvancedObjects.length];
            for (int i = 0; i < source.AdvancedObjects.length; i++) {
                this.AdvancedObjects[i] = new String(source.AdvancedObjects[i]);
            }
        }
        if (source.OnlineDDL != null) {
            this.OnlineDDL = new OnlineDDL(source.OnlineDDL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "Databases.", this.Databases);
        this.setParamArraySimple(map, prefix + "AdvancedObjects.", this.AdvancedObjects);
        this.setParamObj(map, prefix + "OnlineDDL.", this.OnlineDDL);

    }
}

