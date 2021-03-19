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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrationAction extends AbstractModel{

    /**
    * All the allowed operations. Values include: view (viewing a task), modify (modifying a task), start (starting a task), incremental (creating an incremental task), delete (deleting a task), and upload (obtaining the upload permission).
    */
    @SerializedName("AllAction")
    @Expose
    private String [] AllAction;

    /**
    * Operation allowed in the current status. If the subset of AllAction is left empty, no operations will be allowed.
    */
    @SerializedName("AllowedAction")
    @Expose
    private String [] AllowedAction;

    /**
     * Get All the allowed operations. Values include: view (viewing a task), modify (modifying a task), start (starting a task), incremental (creating an incremental task), delete (deleting a task), and upload (obtaining the upload permission). 
     * @return AllAction All the allowed operations. Values include: view (viewing a task), modify (modifying a task), start (starting a task), incremental (creating an incremental task), delete (deleting a task), and upload (obtaining the upload permission).
     */
    public String [] getAllAction() {
        return this.AllAction;
    }

    /**
     * Set All the allowed operations. Values include: view (viewing a task), modify (modifying a task), start (starting a task), incremental (creating an incremental task), delete (deleting a task), and upload (obtaining the upload permission).
     * @param AllAction All the allowed operations. Values include: view (viewing a task), modify (modifying a task), start (starting a task), incremental (creating an incremental task), delete (deleting a task), and upload (obtaining the upload permission).
     */
    public void setAllAction(String [] AllAction) {
        this.AllAction = AllAction;
    }

    /**
     * Get Operation allowed in the current status. If the subset of AllAction is left empty, no operations will be allowed. 
     * @return AllowedAction Operation allowed in the current status. If the subset of AllAction is left empty, no operations will be allowed.
     */
    public String [] getAllowedAction() {
        return this.AllowedAction;
    }

    /**
     * Set Operation allowed in the current status. If the subset of AllAction is left empty, no operations will be allowed.
     * @param AllowedAction Operation allowed in the current status. If the subset of AllAction is left empty, no operations will be allowed.
     */
    public void setAllowedAction(String [] AllowedAction) {
        this.AllowedAction = AllowedAction;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AllAction.", this.AllAction);
        this.setParamArraySimple(map, prefix + "AllowedAction.", this.AllowedAction);

    }
}

