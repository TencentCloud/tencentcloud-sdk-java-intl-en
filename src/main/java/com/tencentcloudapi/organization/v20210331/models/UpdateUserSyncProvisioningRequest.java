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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUserSyncProvisioningRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * User synchronization ID.
    */
    @SerializedName("UserProvisioningId")
    @Expose
    private String UserProvisioningId;

    /**
    * User synchronization description.
    */
    @SerializedName("NewDescription")
    @Expose
    private String NewDescription;

    /**
    * Conflict policy. It indicates the handling policy for existence of a user with the same username when CIC users are synchronized to CAM. Valid values: KeepBoth: Keep both, that is, add the _cic suffix to the CIC user's username and then try to create a CAM user with the username when CIC users are synchronized to CAM and a user with the same username already exists in CAM; TakeOver: Replace, that is, directly replace the existing CAM user with the synchronized CIC user when CIC users are synchronized to CAM and a user with the same username already exists in CAM.
    */
    @SerializedName("NewDuplicationStateful")
    @Expose
    private String NewDuplicationStateful;

    /**
    * Deletion policy. It indicates the handling policy for CAM users already synchronized when the CAM user synchronization is deleted. Valid values: Delete: Delete the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted; Keep: Keep the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted.
    */
    @SerializedName("NewDeletionStrategy")
    @Expose
    private String NewDeletionStrategy;

    /**
     * Get Space ID. 
     * @return ZoneId Space ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Space ID.
     * @param ZoneId Space ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get User synchronization ID. 
     * @return UserProvisioningId User synchronization ID.
     */
    public String getUserProvisioningId() {
        return this.UserProvisioningId;
    }

    /**
     * Set User synchronization ID.
     * @param UserProvisioningId User synchronization ID.
     */
    public void setUserProvisioningId(String UserProvisioningId) {
        this.UserProvisioningId = UserProvisioningId;
    }

    /**
     * Get User synchronization description. 
     * @return NewDescription User synchronization description.
     */
    public String getNewDescription() {
        return this.NewDescription;
    }

    /**
     * Set User synchronization description.
     * @param NewDescription User synchronization description.
     */
    public void setNewDescription(String NewDescription) {
        this.NewDescription = NewDescription;
    }

    /**
     * Get Conflict policy. It indicates the handling policy for existence of a user with the same username when CIC users are synchronized to CAM. Valid values: KeepBoth: Keep both, that is, add the _cic suffix to the CIC user's username and then try to create a CAM user with the username when CIC users are synchronized to CAM and a user with the same username already exists in CAM; TakeOver: Replace, that is, directly replace the existing CAM user with the synchronized CIC user when CIC users are synchronized to CAM and a user with the same username already exists in CAM. 
     * @return NewDuplicationStateful Conflict policy. It indicates the handling policy for existence of a user with the same username when CIC users are synchronized to CAM. Valid values: KeepBoth: Keep both, that is, add the _cic suffix to the CIC user's username and then try to create a CAM user with the username when CIC users are synchronized to CAM and a user with the same username already exists in CAM; TakeOver: Replace, that is, directly replace the existing CAM user with the synchronized CIC user when CIC users are synchronized to CAM and a user with the same username already exists in CAM.
     */
    public String getNewDuplicationStateful() {
        return this.NewDuplicationStateful;
    }

    /**
     * Set Conflict policy. It indicates the handling policy for existence of a user with the same username when CIC users are synchronized to CAM. Valid values: KeepBoth: Keep both, that is, add the _cic suffix to the CIC user's username and then try to create a CAM user with the username when CIC users are synchronized to CAM and a user with the same username already exists in CAM; TakeOver: Replace, that is, directly replace the existing CAM user with the synchronized CIC user when CIC users are synchronized to CAM and a user with the same username already exists in CAM.
     * @param NewDuplicationStateful Conflict policy. It indicates the handling policy for existence of a user with the same username when CIC users are synchronized to CAM. Valid values: KeepBoth: Keep both, that is, add the _cic suffix to the CIC user's username and then try to create a CAM user with the username when CIC users are synchronized to CAM and a user with the same username already exists in CAM; TakeOver: Replace, that is, directly replace the existing CAM user with the synchronized CIC user when CIC users are synchronized to CAM and a user with the same username already exists in CAM.
     */
    public void setNewDuplicationStateful(String NewDuplicationStateful) {
        this.NewDuplicationStateful = NewDuplicationStateful;
    }

    /**
     * Get Deletion policy. It indicates the handling policy for CAM users already synchronized when the CAM user synchronization is deleted. Valid values: Delete: Delete the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted; Keep: Keep the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted. 
     * @return NewDeletionStrategy Deletion policy. It indicates the handling policy for CAM users already synchronized when the CAM user synchronization is deleted. Valid values: Delete: Delete the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted; Keep: Keep the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted.
     */
    public String getNewDeletionStrategy() {
        return this.NewDeletionStrategy;
    }

    /**
     * Set Deletion policy. It indicates the handling policy for CAM users already synchronized when the CAM user synchronization is deleted. Valid values: Delete: Delete the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted; Keep: Keep the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted.
     * @param NewDeletionStrategy Deletion policy. It indicates the handling policy for CAM users already synchronized when the CAM user synchronization is deleted. Valid values: Delete: Delete the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted; Keep: Keep the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted.
     */
    public void setNewDeletionStrategy(String NewDeletionStrategy) {
        this.NewDeletionStrategy = NewDeletionStrategy;
    }

    public UpdateUserSyncProvisioningRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserSyncProvisioningRequest(UpdateUserSyncProvisioningRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.UserProvisioningId != null) {
            this.UserProvisioningId = new String(source.UserProvisioningId);
        }
        if (source.NewDescription != null) {
            this.NewDescription = new String(source.NewDescription);
        }
        if (source.NewDuplicationStateful != null) {
            this.NewDuplicationStateful = new String(source.NewDuplicationStateful);
        }
        if (source.NewDeletionStrategy != null) {
            this.NewDeletionStrategy = new String(source.NewDeletionStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "UserProvisioningId", this.UserProvisioningId);
        this.setParamSimple(map, prefix + "NewDescription", this.NewDescription);
        this.setParamSimple(map, prefix + "NewDuplicationStateful", this.NewDuplicationStateful);
        this.setParamSimple(map, prefix + "NewDeletionStrategy", this.NewDeletionStrategy);

    }
}

