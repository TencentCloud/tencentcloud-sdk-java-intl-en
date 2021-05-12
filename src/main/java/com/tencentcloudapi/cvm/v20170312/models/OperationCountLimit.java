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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationCountLimit extends AbstractModel{

    /**
    * Instance operation. Valid values: <br><li>`INSTANCE_DEGRADE`: downgrade an instance<br><li>`INTERNET_CHARGE_TYPE_CHANGE`: modify the billing plan of the network connection
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Number of operations already performed. If it returns `-1`, it means there is no limit on the times of the operation.
    */
    @SerializedName("CurrentCount")
    @Expose
    private Long CurrentCount;

    /**
    * Maximum number of times you can perform an operation. If it returns `-1`, it means there is no limit on the times of the operation. If it returns `0`, it means that configuration modification is not supported.
    */
    @SerializedName("LimitCount")
    @Expose
    private Long LimitCount;

    /**
     * Get Instance operation. Valid values: <br><li>`INSTANCE_DEGRADE`: downgrade an instance<br><li>`INTERNET_CHARGE_TYPE_CHANGE`: modify the billing plan of the network connection 
     * @return Operation Instance operation. Valid values: <br><li>`INSTANCE_DEGRADE`: downgrade an instance<br><li>`INTERNET_CHARGE_TYPE_CHANGE`: modify the billing plan of the network connection
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Instance operation. Valid values: <br><li>`INSTANCE_DEGRADE`: downgrade an instance<br><li>`INTERNET_CHARGE_TYPE_CHANGE`: modify the billing plan of the network connection
     * @param Operation Instance operation. Valid values: <br><li>`INSTANCE_DEGRADE`: downgrade an instance<br><li>`INTERNET_CHARGE_TYPE_CHANGE`: modify the billing plan of the network connection
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Number of operations already performed. If it returns `-1`, it means there is no limit on the times of the operation. 
     * @return CurrentCount Number of operations already performed. If it returns `-1`, it means there is no limit on the times of the operation.
     */
    public Long getCurrentCount() {
        return this.CurrentCount;
    }

    /**
     * Set Number of operations already performed. If it returns `-1`, it means there is no limit on the times of the operation.
     * @param CurrentCount Number of operations already performed. If it returns `-1`, it means there is no limit on the times of the operation.
     */
    public void setCurrentCount(Long CurrentCount) {
        this.CurrentCount = CurrentCount;
    }

    /**
     * Get Maximum number of times you can perform an operation. If it returns `-1`, it means there is no limit on the times of the operation. If it returns `0`, it means that configuration modification is not supported. 
     * @return LimitCount Maximum number of times you can perform an operation. If it returns `-1`, it means there is no limit on the times of the operation. If it returns `0`, it means that configuration modification is not supported.
     */
    public Long getLimitCount() {
        return this.LimitCount;
    }

    /**
     * Set Maximum number of times you can perform an operation. If it returns `-1`, it means there is no limit on the times of the operation. If it returns `0`, it means that configuration modification is not supported.
     * @param LimitCount Maximum number of times you can perform an operation. If it returns `-1`, it means there is no limit on the times of the operation. If it returns `0`, it means that configuration modification is not supported.
     */
    public void setLimitCount(Long LimitCount) {
        this.LimitCount = LimitCount;
    }

    public OperationCountLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationCountLimit(OperationCountLimit source) {
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CurrentCount != null) {
            this.CurrentCount = new Long(source.CurrentCount);
        }
        if (source.LimitCount != null) {
            this.LimitCount = new Long(source.LimitCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CurrentCount", this.CurrentCount);
        this.setParamSimple(map, prefix + "LimitCount", this.LimitCount);

    }
}

