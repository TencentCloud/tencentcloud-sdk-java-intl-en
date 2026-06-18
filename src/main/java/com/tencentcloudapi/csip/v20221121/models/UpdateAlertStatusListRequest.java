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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAlertStatusListRequest extends AbstractModel {

    /**
    * Alarm ID list
    */
    @SerializedName("ID")
    @Expose
    private NewAlertKey [] ID;

    /**
    * Operation type. 
1: Revoke disposal 
2: Marked with processed 
3: Marked as ignored 
4: Cancel tag disposal
5: Unmark ignore
    */
    @SerializedName("OperateType")
    @Expose
    private Long OperateType;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Member ID of the Called Group Account
    */
    @SerializedName("OperatedMemberId")
    @Expose
    private String [] OperatedMemberId;

    /**
     * Get Alarm ID list 
     * @return ID Alarm ID list
     */
    public NewAlertKey [] getID() {
        return this.ID;
    }

    /**
     * Set Alarm ID list
     * @param ID Alarm ID list
     */
    public void setID(NewAlertKey [] ID) {
        this.ID = ID;
    }

    /**
     * Get Operation type. 
1: Revoke disposal 
2: Marked with processed 
3: Marked as ignored 
4: Cancel tag disposal
5: Unmark ignore 
     * @return OperateType Operation type. 
1: Revoke disposal 
2: Marked with processed 
3: Marked as ignored 
4: Cancel tag disposal
5: Unmark ignore
     */
    public Long getOperateType() {
        return this.OperateType;
    }

    /**
     * Set Operation type. 
1: Revoke disposal 
2: Marked with processed 
3: Marked as ignored 
4: Cancel tag disposal
5: Unmark ignore
     * @param OperateType Operation type. 
1: Revoke disposal 
2: Marked with processed 
3: Marked as ignored 
4: Cancel tag disposal
5: Unmark ignore
     */
    public void setOperateType(Long OperateType) {
        this.OperateType = OperateType;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Member ID of the Called Group Account 
     * @return OperatedMemberId Member ID of the Called Group Account
     */
    public String [] getOperatedMemberId() {
        return this.OperatedMemberId;
    }

    /**
     * Set Member ID of the Called Group Account
     * @param OperatedMemberId Member ID of the Called Group Account
     */
    public void setOperatedMemberId(String [] OperatedMemberId) {
        this.OperatedMemberId = OperatedMemberId;
    }

    public UpdateAlertStatusListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAlertStatusListRequest(UpdateAlertStatusListRequest source) {
        if (source.ID != null) {
            this.ID = new NewAlertKey[source.ID.length];
            for (int i = 0; i < source.ID.length; i++) {
                this.ID[i] = new NewAlertKey(source.ID[i]);
            }
        }
        if (source.OperateType != null) {
            this.OperateType = new Long(source.OperateType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.OperatedMemberId != null) {
            this.OperatedMemberId = new String[source.OperatedMemberId.length];
            for (int i = 0; i < source.OperatedMemberId.length; i++) {
                this.OperatedMemberId[i] = new String(source.OperatedMemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ID.", this.ID);
        this.setParamSimple(map, prefix + "OperateType", this.OperateType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "OperatedMemberId.", this.OperatedMemberId);

    }
}

