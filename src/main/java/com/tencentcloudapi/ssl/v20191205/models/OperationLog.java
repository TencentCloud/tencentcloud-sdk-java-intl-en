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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationLog extends AbstractModel {

    /**
    * Action performed on logs
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Time when the action is performed
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
     * Get Action performed on logs 
     * @return Action Action performed on logs
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action performed on logs
     * @param Action Action performed on logs
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Time when the action is performed 
     * @return CreatedOn Time when the action is performed
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Time when the action is performed
     * @param CreatedOn Time when the action is performed
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    public OperationLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationLog(OperationLog source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);

    }
}

