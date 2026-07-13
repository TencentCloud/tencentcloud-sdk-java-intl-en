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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BudgetOperationLogEntity extends AbstractModel {

    /**
    * Payer Uin
    */
    @SerializedName("PayerUin")
    @Expose
    private Long PayerUin;

    /**
    * User Uin

    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * Operation user Uin
    */
    @SerializedName("OperateUin")
    @Expose
    private Long OperateUin;

    /**
    * Date
    */
    @SerializedName("BillDay")
    @Expose
    private Long BillDay;

    /**
    * month
    */
    @SerializedName("BillMonth")
    @Expose
    private String BillMonth;

    /**
    * Modify type: ADD (add new), UPDATE (update), DELETE (delete)
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * modification information
    */
    @SerializedName("DiffValue")
    @Expose
    private BudgetInfoDiffEntity [] DiffValue;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Modify channel: CONSOLE/API
    */
    @SerializedName("OperationChannel")
    @Expose
    private String OperationChannel;

    /**
    * Budget project id
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
     * Get Payer Uin 
     * @return PayerUin Payer Uin
     */
    public Long getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set Payer Uin
     * @param PayerUin Payer Uin
     */
    public void setPayerUin(Long PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get User Uin
 
     * @return OwnerUin User Uin

     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set User Uin

     * @param OwnerUin User Uin

     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Operation user Uin 
     * @return OperateUin Operation user Uin
     */
    public Long getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set Operation user Uin
     * @param OperateUin Operation user Uin
     */
    public void setOperateUin(Long OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get Date 
     * @return BillDay Date
     */
    public Long getBillDay() {
        return this.BillDay;
    }

    /**
     * Set Date
     * @param BillDay Date
     */
    public void setBillDay(Long BillDay) {
        this.BillDay = BillDay;
    }

    /**
     * Get month 
     * @return BillMonth month
     */
    public String getBillMonth() {
        return this.BillMonth;
    }

    /**
     * Set month
     * @param BillMonth month
     */
    public void setBillMonth(String BillMonth) {
        this.BillMonth = BillMonth;
    }

    /**
     * Get Modify type: ADD (add new), UPDATE (update), DELETE (delete) 
     * @return Action Modify type: ADD (add new), UPDATE (update), DELETE (delete)
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Modify type: ADD (add new), UPDATE (update), DELETE (delete)
     * @param Action Modify type: ADD (add new), UPDATE (update), DELETE (delete)
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get modification information 
     * @return DiffValue modification information
     */
    public BudgetInfoDiffEntity [] getDiffValue() {
        return this.DiffValue;
    }

    /**
     * Set modification information
     * @param DiffValue modification information
     */
    public void setDiffValue(BudgetInfoDiffEntity [] DiffValue) {
        this.DiffValue = DiffValue;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time. 
     * @return UpdateTime Modification time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modification time.
     * @param UpdateTime Modification time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Modify channel: CONSOLE/API 
     * @return OperationChannel Modify channel: CONSOLE/API
     */
    public String getOperationChannel() {
        return this.OperationChannel;
    }

    /**
     * Set Modify channel: CONSOLE/API
     * @param OperationChannel Modify channel: CONSOLE/API
     */
    public void setOperationChannel(String OperationChannel) {
        this.OperationChannel = OperationChannel;
    }

    /**
     * Get Budget project id 
     * @return BudgetId Budget project id
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set Budget project id
     * @param BudgetId Budget project id
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    public BudgetOperationLogEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetOperationLogEntity(BudgetOperationLogEntity source) {
        if (source.PayerUin != null) {
            this.PayerUin = new Long(source.PayerUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new Long(source.OperateUin);
        }
        if (source.BillDay != null) {
            this.BillDay = new Long(source.BillDay);
        }
        if (source.BillMonth != null) {
            this.BillMonth = new String(source.BillMonth);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.DiffValue != null) {
            this.DiffValue = new BudgetInfoDiffEntity[source.DiffValue.length];
            for (int i = 0; i < source.DiffValue.length; i++) {
                this.DiffValue[i] = new BudgetInfoDiffEntity(source.DiffValue[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OperationChannel != null) {
            this.OperationChannel = new String(source.OperationChannel);
        }
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "BillDay", this.BillDay);
        this.setParamSimple(map, prefix + "BillMonth", this.BillMonth);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArrayObj(map, prefix + "DiffValue.", this.DiffValue);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OperationChannel", this.OperationChannel);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);

    }
}

