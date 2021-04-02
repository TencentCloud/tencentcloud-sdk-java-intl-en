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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Player extends AbstractModel{

    /**
    * Player ID. It can contain up to 128 characters, supporting [a-zA-Z\d-\._]*.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Player nickname. Up to 128 characters are allowed.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Player attribute for matching. Up to 10 attributes are supported.
    */
    @SerializedName("MatchAttributes")
    @Expose
    private MatchAttribute [] MatchAttributes;

    /**
    * Team name. A player can pass in a different team name, which can contain up to 128 characters, and support [a-zA-Z0-9-\.]*.
    */
    @SerializedName("Team")
    @Expose
    private String Team;

    /**
    * Custom player status. This parameter will be passed through. Value range: [0, 99999]
    */
    @SerializedName("CustomPlayerStatus")
    @Expose
    private Long CustomPlayerStatus;

    /**
    * Custom player information. Up to 1024 characters are allowed. This parameter will be passed through.
    */
    @SerializedName("CustomProfile")
    @Expose
    private String CustomProfile;

    /**
    * Number of delays in each area. Up to 20 delays are supported.
    */
    @SerializedName("RegionLatencies")
    @Expose
    private RegionLatency [] RegionLatencies;

    /**
     * Get Player ID. It can contain up to 128 characters, supporting [a-zA-Z\d-\._]*. 
     * @return Id Player ID. It can contain up to 128 characters, supporting [a-zA-Z\d-\._]*.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Player ID. It can contain up to 128 characters, supporting [a-zA-Z\d-\._]*.
     * @param Id Player ID. It can contain up to 128 characters, supporting [a-zA-Z\d-\._]*.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Player nickname. Up to 128 characters are allowed. 
     * @return Name Player nickname. Up to 128 characters are allowed.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Player nickname. Up to 128 characters are allowed.
     * @param Name Player nickname. Up to 128 characters are allowed.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Player attribute for matching. Up to 10 attributes are supported. 
     * @return MatchAttributes Player attribute for matching. Up to 10 attributes are supported.
     */
    public MatchAttribute [] getMatchAttributes() {
        return this.MatchAttributes;
    }

    /**
     * Set Player attribute for matching. Up to 10 attributes are supported.
     * @param MatchAttributes Player attribute for matching. Up to 10 attributes are supported.
     */
    public void setMatchAttributes(MatchAttribute [] MatchAttributes) {
        this.MatchAttributes = MatchAttributes;
    }

    /**
     * Get Team name. A player can pass in a different team name, which can contain up to 128 characters, and support [a-zA-Z0-9-\.]*. 
     * @return Team Team name. A player can pass in a different team name, which can contain up to 128 characters, and support [a-zA-Z0-9-\.]*.
     */
    public String getTeam() {
        return this.Team;
    }

    /**
     * Set Team name. A player can pass in a different team name, which can contain up to 128 characters, and support [a-zA-Z0-9-\.]*.
     * @param Team Team name. A player can pass in a different team name, which can contain up to 128 characters, and support [a-zA-Z0-9-\.]*.
     */
    public void setTeam(String Team) {
        this.Team = Team;
    }

    /**
     * Get Custom player status. This parameter will be passed through. Value range: [0, 99999] 
     * @return CustomPlayerStatus Custom player status. This parameter will be passed through. Value range: [0, 99999]
     */
    public Long getCustomPlayerStatus() {
        return this.CustomPlayerStatus;
    }

    /**
     * Set Custom player status. This parameter will be passed through. Value range: [0, 99999]
     * @param CustomPlayerStatus Custom player status. This parameter will be passed through. Value range: [0, 99999]
     */
    public void setCustomPlayerStatus(Long CustomPlayerStatus) {
        this.CustomPlayerStatus = CustomPlayerStatus;
    }

    /**
     * Get Custom player information. Up to 1024 characters are allowed. This parameter will be passed through. 
     * @return CustomProfile Custom player information. Up to 1024 characters are allowed. This parameter will be passed through.
     */
    public String getCustomProfile() {
        return this.CustomProfile;
    }

    /**
     * Set Custom player information. Up to 1024 characters are allowed. This parameter will be passed through.
     * @param CustomProfile Custom player information. Up to 1024 characters are allowed. This parameter will be passed through.
     */
    public void setCustomProfile(String CustomProfile) {
        this.CustomProfile = CustomProfile;
    }

    /**
     * Get Number of delays in each area. Up to 20 delays are supported. 
     * @return RegionLatencies Number of delays in each area. Up to 20 delays are supported.
     */
    public RegionLatency [] getRegionLatencies() {
        return this.RegionLatencies;
    }

    /**
     * Set Number of delays in each area. Up to 20 delays are supported.
     * @param RegionLatencies Number of delays in each area. Up to 20 delays are supported.
     */
    public void setRegionLatencies(RegionLatency [] RegionLatencies) {
        this.RegionLatencies = RegionLatencies;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "MatchAttributes.", this.MatchAttributes);
        this.setParamSimple(map, prefix + "Team", this.Team);
        this.setParamSimple(map, prefix + "CustomPlayerStatus", this.CustomPlayerStatus);
        this.setParamSimple(map, prefix + "CustomProfile", this.CustomProfile);
        this.setParamArrayObj(map, prefix + "RegionLatencies.", this.RegionLatencies);

    }
}

