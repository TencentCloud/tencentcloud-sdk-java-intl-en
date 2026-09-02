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

public class AccessKeyWhiteList extends AbstractModel {

    /**
    * Allowlist ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Allowlist policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * ak allowlist
    */
    @SerializedName("AKList")
    @Expose
    private String [] AKList;

    /**
    * ip allowlist
    */
    @SerializedName("IPList")
    @Expose
    private String [] IPList;

    /**
    * ip type list IP type. 0: within the account (no remark). 1: outside the account (no remark). 2: within the account (remarked). 3: outside the account (remarked). 4: LAN (no remark). 5: LAN (remarked)
    */
    @SerializedName("IPTypeList")
    @Expose
    private Long [] IPTypeList;

    /**
    * API allowlist
    */
    @SerializedName("ActionList")
    @Expose
    private String [] ActionList;

    /**
    * Add the call method to the allowlist
0: all calling methods
1 Console
2 API
-1 Nonexistent
    */
    @SerializedName("CallType")
    @Expose
    private Long CallType;

    /**
    * Error code allowlist (other error codes to be supplemented)
0: successful.

    */
    @SerializedName("ErrorCodeList")
    @Expose
    private Long [] ErrorCodeList;

    /**
    * Policy content/description
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Input type of ak 
0: Select from existing
1: Manually enter
2: Temporary key
3: Persistent key
4: All keys
-1: None
    */
    @SerializedName("AkImportType")
    @Expose
    private Long AkImportType;

    /**
    * Main account AppID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * uin of the main account
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Main account Nickname
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * Whether to process past alarms
    */
    @SerializedName("NeedDealPastAlarm")
    @Expose
    private Boolean NeedDealPastAlarm;

    /**
    * Processing status
0: Processing completed
1 Currently processing
    */
    @SerializedName("DealStatus")
    @Expose
    private Long DealStatus;

    /**
    * Select an API
0: Custom input
1: Select product+api format interaction
2: All interfaces
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * List of binding policy IDs. If this parameter is empty, the policy takes effect globally.
    */
    @SerializedName("AlarmPolicyID")
    @Expose
    private Long [] AlarmPolicyID;

    /**
     * Get Allowlist ID 
     * @return ID Allowlist ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Allowlist ID
     * @param ID Allowlist ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Allowlist policy name 
     * @return Name Allowlist policy name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Allowlist policy name
     * @param Name Allowlist policy name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get ak allowlist 
     * @return AKList ak allowlist
     */
    public String [] getAKList() {
        return this.AKList;
    }

    /**
     * Set ak allowlist
     * @param AKList ak allowlist
     */
    public void setAKList(String [] AKList) {
        this.AKList = AKList;
    }

    /**
     * Get ip allowlist 
     * @return IPList ip allowlist
     */
    public String [] getIPList() {
        return this.IPList;
    }

    /**
     * Set ip allowlist
     * @param IPList ip allowlist
     */
    public void setIPList(String [] IPList) {
        this.IPList = IPList;
    }

    /**
     * Get ip type list IP type. 0: within the account (no remark). 1: outside the account (no remark). 2: within the account (remarked). 3: outside the account (remarked). 4: LAN (no remark). 5: LAN (remarked) 
     * @return IPTypeList ip type list IP type. 0: within the account (no remark). 1: outside the account (no remark). 2: within the account (remarked). 3: outside the account (remarked). 4: LAN (no remark). 5: LAN (remarked)
     */
    public Long [] getIPTypeList() {
        return this.IPTypeList;
    }

    /**
     * Set ip type list IP type. 0: within the account (no remark). 1: outside the account (no remark). 2: within the account (remarked). 3: outside the account (remarked). 4: LAN (no remark). 5: LAN (remarked)
     * @param IPTypeList ip type list IP type. 0: within the account (no remark). 1: outside the account (no remark). 2: within the account (remarked). 3: outside the account (remarked). 4: LAN (no remark). 5: LAN (remarked)
     */
    public void setIPTypeList(Long [] IPTypeList) {
        this.IPTypeList = IPTypeList;
    }

    /**
     * Get API allowlist 
     * @return ActionList API allowlist
     */
    public String [] getActionList() {
        return this.ActionList;
    }

    /**
     * Set API allowlist
     * @param ActionList API allowlist
     */
    public void setActionList(String [] ActionList) {
        this.ActionList = ActionList;
    }

    /**
     * Get Add the call method to the allowlist
0: all calling methods
1 Console
2 API
-1 Nonexistent 
     * @return CallType Add the call method to the allowlist
0: all calling methods
1 Console
2 API
-1 Nonexistent
     */
    public Long getCallType() {
        return this.CallType;
    }

    /**
     * Set Add the call method to the allowlist
0: all calling methods
1 Console
2 API
-1 Nonexistent
     * @param CallType Add the call method to the allowlist
0: all calling methods
1 Console
2 API
-1 Nonexistent
     */
    public void setCallType(Long CallType) {
        this.CallType = CallType;
    }

    /**
     * Get Error code allowlist (other error codes to be supplemented)
0: successful.
 
     * @return ErrorCodeList Error code allowlist (other error codes to be supplemented)
0: successful.

     */
    public Long [] getErrorCodeList() {
        return this.ErrorCodeList;
    }

    /**
     * Set Error code allowlist (other error codes to be supplemented)
0: successful.

     * @param ErrorCodeList Error code allowlist (other error codes to be supplemented)
0: successful.

     */
    public void setErrorCodeList(Long [] ErrorCodeList) {
        this.ErrorCodeList = ErrorCodeList;
    }

    /**
     * Get Policy content/description 
     * @return Remark Policy content/description
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Policy content/description
     * @param Remark Policy content/description
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Input type of ak 
0: Select from existing
1: Manually enter
2: Temporary key
3: Persistent key
4: All keys
-1: None 
     * @return AkImportType Input type of ak 
0: Select from existing
1: Manually enter
2: Temporary key
3: Persistent key
4: All keys
-1: None
     */
    public Long getAkImportType() {
        return this.AkImportType;
    }

    /**
     * Set Input type of ak 
0: Select from existing
1: Manually enter
2: Temporary key
3: Persistent key
4: All keys
-1: None
     * @param AkImportType Input type of ak 
0: Select from existing
1: Manually enter
2: Temporary key
3: Persistent key
4: All keys
-1: None
     */
    public void setAkImportType(Long AkImportType) {
        this.AkImportType = AkImportType;
    }

    /**
     * Get Main account AppID 
     * @return AppID Main account AppID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set Main account AppID
     * @param AppID Main account AppID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get uin of the main account 
     * @return Uin uin of the main account
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set uin of the main account
     * @param Uin uin of the main account
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Main account Nickname 
     * @return Nickname Main account Nickname
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set Main account Nickname
     * @param Nickname Main account Nickname
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get Whether to process past alarms 
     * @return NeedDealPastAlarm Whether to process past alarms
     */
    public Boolean getNeedDealPastAlarm() {
        return this.NeedDealPastAlarm;
    }

    /**
     * Set Whether to process past alarms
     * @param NeedDealPastAlarm Whether to process past alarms
     */
    public void setNeedDealPastAlarm(Boolean NeedDealPastAlarm) {
        this.NeedDealPastAlarm = NeedDealPastAlarm;
    }

    /**
     * Get Processing status
0: Processing completed
1 Currently processing 
     * @return DealStatus Processing status
0: Processing completed
1 Currently processing
     */
    public Long getDealStatus() {
        return this.DealStatus;
    }

    /**
     * Set Processing status
0: Processing completed
1 Currently processing
     * @param DealStatus Processing status
0: Processing completed
1 Currently processing
     */
    public void setDealStatus(Long DealStatus) {
        this.DealStatus = DealStatus;
    }

    /**
     * Get Select an API
0: Custom input
1: Select product+api format interaction
2: All interfaces 
     * @return ActionType Select an API
0: Custom input
1: Select product+api format interaction
2: All interfaces
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set Select an API
0: Custom input
1: Select product+api format interaction
2: All interfaces
     * @param ActionType Select an API
0: Custom input
1: Select product+api format interaction
2: All interfaces
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get List of binding policy IDs. If this parameter is empty, the policy takes effect globally. 
     * @return AlarmPolicyID List of binding policy IDs. If this parameter is empty, the policy takes effect globally.
     */
    public Long [] getAlarmPolicyID() {
        return this.AlarmPolicyID;
    }

    /**
     * Set List of binding policy IDs. If this parameter is empty, the policy takes effect globally.
     * @param AlarmPolicyID List of binding policy IDs. If this parameter is empty, the policy takes effect globally.
     */
    public void setAlarmPolicyID(Long [] AlarmPolicyID) {
        this.AlarmPolicyID = AlarmPolicyID;
    }

    public AccessKeyWhiteList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyWhiteList(AccessKeyWhiteList source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AKList != null) {
            this.AKList = new String[source.AKList.length];
            for (int i = 0; i < source.AKList.length; i++) {
                this.AKList[i] = new String(source.AKList[i]);
            }
        }
        if (source.IPList != null) {
            this.IPList = new String[source.IPList.length];
            for (int i = 0; i < source.IPList.length; i++) {
                this.IPList[i] = new String(source.IPList[i]);
            }
        }
        if (source.IPTypeList != null) {
            this.IPTypeList = new Long[source.IPTypeList.length];
            for (int i = 0; i < source.IPTypeList.length; i++) {
                this.IPTypeList[i] = new Long(source.IPTypeList[i]);
            }
        }
        if (source.ActionList != null) {
            this.ActionList = new String[source.ActionList.length];
            for (int i = 0; i < source.ActionList.length; i++) {
                this.ActionList[i] = new String(source.ActionList[i]);
            }
        }
        if (source.CallType != null) {
            this.CallType = new Long(source.CallType);
        }
        if (source.ErrorCodeList != null) {
            this.ErrorCodeList = new Long[source.ErrorCodeList.length];
            for (int i = 0; i < source.ErrorCodeList.length; i++) {
                this.ErrorCodeList[i] = new Long(source.ErrorCodeList[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AkImportType != null) {
            this.AkImportType = new Long(source.AkImportType);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.NeedDealPastAlarm != null) {
            this.NeedDealPastAlarm = new Boolean(source.NeedDealPastAlarm);
        }
        if (source.DealStatus != null) {
            this.DealStatus = new Long(source.DealStatus);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.AlarmPolicyID != null) {
            this.AlarmPolicyID = new Long[source.AlarmPolicyID.length];
            for (int i = 0; i < source.AlarmPolicyID.length; i++) {
                this.AlarmPolicyID[i] = new Long(source.AlarmPolicyID[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "AKList.", this.AKList);
        this.setParamArraySimple(map, prefix + "IPList.", this.IPList);
        this.setParamArraySimple(map, prefix + "IPTypeList.", this.IPTypeList);
        this.setParamArraySimple(map, prefix + "ActionList.", this.ActionList);
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamArraySimple(map, prefix + "ErrorCodeList.", this.ErrorCodeList);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AkImportType", this.AkImportType);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "NeedDealPastAlarm", this.NeedDealPastAlarm);
        this.setParamSimple(map, prefix + "DealStatus", this.DealStatus);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamArraySimple(map, prefix + "AlarmPolicyID.", this.AlarmPolicyID);

    }
}

