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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotOperateLog extends AbstractModel {

    /**
    * Operation type
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Operation time
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
    * Operation name
    */
    @SerializedName("ActionName")
    @Expose
    private String ActionName;

    /**
    * Operator
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Result
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
     * Get Operation type 
     * @return Action Operation type
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Operation type
     * @param Action Operation type
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Operation time 
     * @return ActionTime Operation time
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set Operation time
     * @param ActionTime Operation time
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    /**
     * Get Operation name 
     * @return ActionName Operation name
     */
    public String getActionName() {
        return this.ActionName;
    }

    /**
     * Set Operation name
     * @param ActionName Operation name
     */
    public void setActionName(String ActionName) {
        this.ActionName = ActionName;
    }

    /**
     * Get Operator 
     * @return Operator Operator
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator
     * @param Operator Operator
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Result 
     * @return Result Result
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set Result
     * @param Result Result
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    public SnapshotOperateLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotOperateLog(SnapshotOperateLog source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.ActionTime != null) {
            this.ActionTime = new String(source.ActionTime);
        }
        if (source.ActionName != null) {
            this.ActionName = new String(source.ActionName);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ActionTime", this.ActionTime);
        this.setParamSimple(map, prefix + "ActionName", this.ActionName);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

