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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileAction extends AbstractModel {

    /**
    * Allowed operations. Valid values: `view` (view list), `remark` (modify remark), `deploy` (deploy files), `delete` (delete files).
    */
    @SerializedName("AllAction")
    @Expose
    private String [] AllAction;

    /**
    * Operation allowed in the current status. If the subset of `AllAction` is empty, no operations will be allowed.
    */
    @SerializedName("AllowedAction")
    @Expose
    private String [] AllowedAction;

    /**
     * Get Allowed operations. Valid values: `view` (view list), `remark` (modify remark), `deploy` (deploy files), `delete` (delete files). 
     * @return AllAction Allowed operations. Valid values: `view` (view list), `remark` (modify remark), `deploy` (deploy files), `delete` (delete files).
     */
    public String [] getAllAction() {
        return this.AllAction;
    }

    /**
     * Set Allowed operations. Valid values: `view` (view list), `remark` (modify remark), `deploy` (deploy files), `delete` (delete files).
     * @param AllAction Allowed operations. Valid values: `view` (view list), `remark` (modify remark), `deploy` (deploy files), `delete` (delete files).
     */
    public void setAllAction(String [] AllAction) {
        this.AllAction = AllAction;
    }

    /**
     * Get Operation allowed in the current status. If the subset of `AllAction` is empty, no operations will be allowed. 
     * @return AllowedAction Operation allowed in the current status. If the subset of `AllAction` is empty, no operations will be allowed.
     */
    public String [] getAllowedAction() {
        return this.AllowedAction;
    }

    /**
     * Set Operation allowed in the current status. If the subset of `AllAction` is empty, no operations will be allowed.
     * @param AllowedAction Operation allowed in the current status. If the subset of `AllAction` is empty, no operations will be allowed.
     */
    public void setAllowedAction(String [] AllowedAction) {
        this.AllowedAction = AllowedAction;
    }

    public FileAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileAction(FileAction source) {
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

