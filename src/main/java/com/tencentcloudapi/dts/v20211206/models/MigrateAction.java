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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateAction extends AbstractModel {

    /**
    * List of all operations in the task
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AllAction")
    @Expose
    private String [] AllAction;

    /**
    * List of allowed operations in the task under the current status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AllowedAction")
    @Expose
    private String [] AllowedAction;

    /**
     * Get List of all operations in the task
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AllAction List of all operations in the task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAllAction() {
        return this.AllAction;
    }

    /**
     * Set List of all operations in the task
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AllAction List of all operations in the task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAllAction(String [] AllAction) {
        this.AllAction = AllAction;
    }

    /**
     * Get List of allowed operations in the task under the current status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AllowedAction List of allowed operations in the task under the current status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAllowedAction() {
        return this.AllowedAction;
    }

    /**
     * Set List of allowed operations in the task under the current status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AllowedAction List of allowed operations in the task under the current status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAllowedAction(String [] AllowedAction) {
        this.AllowedAction = AllowedAction;
    }

    public MigrateAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateAction(MigrateAction source) {
        if (source.AllAction != null) {
            this.AllAction = new String[source.AllAction.length];
            for (int i = 0; i < source.AllAction.length; i++) {
                this.AllAction[i] = new String(source.AllAction[i]);
            }
        }
        if (source.AllowedAction != null) {
            this.AllowedAction = new String[source.AllowedAction.length];
            for (int i = 0; i < source.AllowedAction.length; i++) {
                this.AllowedAction[i] = new String(source.AllowedAction[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AllAction.", this.AllAction);
        this.setParamArraySimple(map, prefix + "AllowedAction.", this.AllowedAction);

    }
}

