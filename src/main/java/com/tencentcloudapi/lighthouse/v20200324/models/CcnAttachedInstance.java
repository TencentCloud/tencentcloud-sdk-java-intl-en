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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnAttachedInstance extends AbstractModel{

    /**
    * CCN instance ID.
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * CIDR block of associated instance.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String [] CidrBlock;

    /**
    * Associated instance status:

•  PENDING: applying
•  ACTIVE: connected
•  EXPIRED: expired
•  REJECTED: rejected
•  DELETED: deleted
•  FAILED: failed (it will be asynchronously unassociated after 2 hours)
•  ATTACHING: associating
•  DETACHING: unassociating
•  DETACHFAILED: failed to unassociate (it will be asynchronously unassociated after 2 hours)
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Association time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttachedTime")
    @Expose
    private String AttachedTime;

    /**
    * Remarks
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get CCN instance ID. 
     * @return CcnId CCN instance ID.
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set CCN instance ID.
     * @param CcnId CCN instance ID.
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get CIDR block of associated instance. 
     * @return CidrBlock CIDR block of associated instance.
     */
    public String [] getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set CIDR block of associated instance.
     * @param CidrBlock CIDR block of associated instance.
     */
    public void setCidrBlock(String [] CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get Associated instance status:

•  PENDING: applying
•  ACTIVE: connected
•  EXPIRED: expired
•  REJECTED: rejected
•  DELETED: deleted
•  FAILED: failed (it will be asynchronously unassociated after 2 hours)
•  ATTACHING: associating
•  DETACHING: unassociating
•  DETACHFAILED: failed to unassociate (it will be asynchronously unassociated after 2 hours) 
     * @return State Associated instance status:

•  PENDING: applying
•  ACTIVE: connected
•  EXPIRED: expired
•  REJECTED: rejected
•  DELETED: deleted
•  FAILED: failed (it will be asynchronously unassociated after 2 hours)
•  ATTACHING: associating
•  DETACHING: unassociating
•  DETACHFAILED: failed to unassociate (it will be asynchronously unassociated after 2 hours)
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Associated instance status:

•  PENDING: applying
•  ACTIVE: connected
•  EXPIRED: expired
•  REJECTED: rejected
•  DELETED: deleted
•  FAILED: failed (it will be asynchronously unassociated after 2 hours)
•  ATTACHING: associating
•  DETACHING: unassociating
•  DETACHFAILED: failed to unassociate (it will be asynchronously unassociated after 2 hours)
     * @param State Associated instance status:

•  PENDING: applying
•  ACTIVE: connected
•  EXPIRED: expired
•  REJECTED: rejected
•  DELETED: deleted
•  FAILED: failed (it will be asynchronously unassociated after 2 hours)
•  ATTACHING: associating
•  DETACHING: unassociating
•  DETACHFAILED: failed to unassociate (it will be asynchronously unassociated after 2 hours)
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Association time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AttachedTime Association time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAttachedTime() {
        return this.AttachedTime;
    }

    /**
     * Set Association time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AttachedTime Association time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAttachedTime(String AttachedTime) {
        this.AttachedTime = AttachedTime;
    }

    /**
     * Get Remarks 
     * @return Description Remarks
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Remarks
     * @param Description Remarks
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CcnAttachedInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnAttachedInstance(CcnAttachedInstance source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String[source.CidrBlock.length];
            for (int i = 0; i < source.CidrBlock.length; i++) {
                this.CidrBlock[i] = new String(source.CidrBlock[i]);
            }
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.AttachedTime != null) {
            this.AttachedTime = new String(source.AttachedTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamArraySimple(map, prefix + "CidrBlock.", this.CidrBlock);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AttachedTime", this.AttachedTime);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

