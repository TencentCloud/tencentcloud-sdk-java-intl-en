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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetentionData extends AbstractModel {

    /**
    * Number of active users
    */
    @SerializedName("ActiveUserCount")
    @Expose
    private Long ActiveUserCount;

    /**
    * Day 1 retention of active users
    */
    @SerializedName("OneDayRetentionUsers")
    @Expose
    private Long OneDayRetentionUsers;

    /**
    * Day 2 retention of active users
    */
    @SerializedName("TwoDayRetentionUsers")
    @Expose
    private Long TwoDayRetentionUsers;

    /**
    * Day 3 retention of active users
    */
    @SerializedName("ThreeDayRetentionUsers")
    @Expose
    private Long ThreeDayRetentionUsers;

    /**
    * Day 4 retention of active users
    */
    @SerializedName("FourDayRetentionUsers")
    @Expose
    private Long FourDayRetentionUsers;

    /**
    * Day 5 retention of active users
    */
    @SerializedName("FiveDayRetentionUsers")
    @Expose
    private Long FiveDayRetentionUsers;

    /**
    * Day 6 retention of active users
    */
    @SerializedName("SixDayRetentionUsers")
    @Expose
    private Long SixDayRetentionUsers;

    /**
    * Day 7 retention of active users
    */
    @SerializedName("SevenDayRetentionUsers")
    @Expose
    private Long SevenDayRetentionUsers;

    /**
    * Day 14 retention of active users
    */
    @SerializedName("FourteenDayRetentionUsers")
    @Expose
    private Long FourteenDayRetentionUsers;

    /**
    * Day 30 retention of active users
    */
    @SerializedName("ThirtyDayRetentionUsers")
    @Expose
    private Long ThirtyDayRetentionUsers;

    /**
    * Number of new users
    */
    @SerializedName("NewUserCount")
    @Expose
    private Long NewUserCount;

    /**
    * Day 1 retention of new users
    */
    @SerializedName("OneDayRetentionNewUsers")
    @Expose
    private Long OneDayRetentionNewUsers;

    /**
    * Day 2 retention of new users
    */
    @SerializedName("TwoDayRetentionNewUsers")
    @Expose
    private Long TwoDayRetentionNewUsers;

    /**
    * Day 3 retention of new users
    */
    @SerializedName("ThreeDayRetentionNewUsers")
    @Expose
    private Long ThreeDayRetentionNewUsers;

    /**
    * Day 4 retention of new users
    */
    @SerializedName("FourDayRetentionNewUsers")
    @Expose
    private Long FourDayRetentionNewUsers;

    /**
    * Day 5 retention of new users
    */
    @SerializedName("FiveDayRetentionNewUsers")
    @Expose
    private Long FiveDayRetentionNewUsers;

    /**
    * Day 6 retention of new users
    */
    @SerializedName("SixDayRetentionNewUsers")
    @Expose
    private Long SixDayRetentionNewUsers;

    /**
    * Day 7 retention of new users
    */
    @SerializedName("SevenDayRetentionNewUsers")
    @Expose
    private Long SevenDayRetentionNewUsers;

    /**
    * Day 14 retention of new users
    */
    @SerializedName("FourteenDayRetentionNewUsers")
    @Expose
    private Long FourteenDayRetentionNewUsers;

    /**
    * Day 30 retention of new users
    */
    @SerializedName("ThirtyDayRetentionNewUsers")
    @Expose
    private Long ThirtyDayRetentionNewUsers;

    /**
    * Data time in YYYYMMDD format
    */
    @SerializedName("DataTime")
    @Expose
    private String DataTime;

    /**
     * Get Number of active users 
     * @return ActiveUserCount Number of active users
     */
    public Long getActiveUserCount() {
        return this.ActiveUserCount;
    }

    /**
     * Set Number of active users
     * @param ActiveUserCount Number of active users
     */
    public void setActiveUserCount(Long ActiveUserCount) {
        this.ActiveUserCount = ActiveUserCount;
    }

    /**
     * Get Day 1 retention of active users 
     * @return OneDayRetentionUsers Day 1 retention of active users
     */
    public Long getOneDayRetentionUsers() {
        return this.OneDayRetentionUsers;
    }

    /**
     * Set Day 1 retention of active users
     * @param OneDayRetentionUsers Day 1 retention of active users
     */
    public void setOneDayRetentionUsers(Long OneDayRetentionUsers) {
        this.OneDayRetentionUsers = OneDayRetentionUsers;
    }

    /**
     * Get Day 2 retention of active users 
     * @return TwoDayRetentionUsers Day 2 retention of active users
     */
    public Long getTwoDayRetentionUsers() {
        return this.TwoDayRetentionUsers;
    }

    /**
     * Set Day 2 retention of active users
     * @param TwoDayRetentionUsers Day 2 retention of active users
     */
    public void setTwoDayRetentionUsers(Long TwoDayRetentionUsers) {
        this.TwoDayRetentionUsers = TwoDayRetentionUsers;
    }

    /**
     * Get Day 3 retention of active users 
     * @return ThreeDayRetentionUsers Day 3 retention of active users
     */
    public Long getThreeDayRetentionUsers() {
        return this.ThreeDayRetentionUsers;
    }

    /**
     * Set Day 3 retention of active users
     * @param ThreeDayRetentionUsers Day 3 retention of active users
     */
    public void setThreeDayRetentionUsers(Long ThreeDayRetentionUsers) {
        this.ThreeDayRetentionUsers = ThreeDayRetentionUsers;
    }

    /**
     * Get Day 4 retention of active users 
     * @return FourDayRetentionUsers Day 4 retention of active users
     */
    public Long getFourDayRetentionUsers() {
        return this.FourDayRetentionUsers;
    }

    /**
     * Set Day 4 retention of active users
     * @param FourDayRetentionUsers Day 4 retention of active users
     */
    public void setFourDayRetentionUsers(Long FourDayRetentionUsers) {
        this.FourDayRetentionUsers = FourDayRetentionUsers;
    }

    /**
     * Get Day 5 retention of active users 
     * @return FiveDayRetentionUsers Day 5 retention of active users
     */
    public Long getFiveDayRetentionUsers() {
        return this.FiveDayRetentionUsers;
    }

    /**
     * Set Day 5 retention of active users
     * @param FiveDayRetentionUsers Day 5 retention of active users
     */
    public void setFiveDayRetentionUsers(Long FiveDayRetentionUsers) {
        this.FiveDayRetentionUsers = FiveDayRetentionUsers;
    }

    /**
     * Get Day 6 retention of active users 
     * @return SixDayRetentionUsers Day 6 retention of active users
     */
    public Long getSixDayRetentionUsers() {
        return this.SixDayRetentionUsers;
    }

    /**
     * Set Day 6 retention of active users
     * @param SixDayRetentionUsers Day 6 retention of active users
     */
    public void setSixDayRetentionUsers(Long SixDayRetentionUsers) {
        this.SixDayRetentionUsers = SixDayRetentionUsers;
    }

    /**
     * Get Day 7 retention of active users 
     * @return SevenDayRetentionUsers Day 7 retention of active users
     */
    public Long getSevenDayRetentionUsers() {
        return this.SevenDayRetentionUsers;
    }

    /**
     * Set Day 7 retention of active users
     * @param SevenDayRetentionUsers Day 7 retention of active users
     */
    public void setSevenDayRetentionUsers(Long SevenDayRetentionUsers) {
        this.SevenDayRetentionUsers = SevenDayRetentionUsers;
    }

    /**
     * Get Day 14 retention of active users 
     * @return FourteenDayRetentionUsers Day 14 retention of active users
     */
    public Long getFourteenDayRetentionUsers() {
        return this.FourteenDayRetentionUsers;
    }

    /**
     * Set Day 14 retention of active users
     * @param FourteenDayRetentionUsers Day 14 retention of active users
     */
    public void setFourteenDayRetentionUsers(Long FourteenDayRetentionUsers) {
        this.FourteenDayRetentionUsers = FourteenDayRetentionUsers;
    }

    /**
     * Get Day 30 retention of active users 
     * @return ThirtyDayRetentionUsers Day 30 retention of active users
     */
    public Long getThirtyDayRetentionUsers() {
        return this.ThirtyDayRetentionUsers;
    }

    /**
     * Set Day 30 retention of active users
     * @param ThirtyDayRetentionUsers Day 30 retention of active users
     */
    public void setThirtyDayRetentionUsers(Long ThirtyDayRetentionUsers) {
        this.ThirtyDayRetentionUsers = ThirtyDayRetentionUsers;
    }

    /**
     * Get Number of new users 
     * @return NewUserCount Number of new users
     */
    public Long getNewUserCount() {
        return this.NewUserCount;
    }

    /**
     * Set Number of new users
     * @param NewUserCount Number of new users
     */
    public void setNewUserCount(Long NewUserCount) {
        this.NewUserCount = NewUserCount;
    }

    /**
     * Get Day 1 retention of new users 
     * @return OneDayRetentionNewUsers Day 1 retention of new users
     */
    public Long getOneDayRetentionNewUsers() {
        return this.OneDayRetentionNewUsers;
    }

    /**
     * Set Day 1 retention of new users
     * @param OneDayRetentionNewUsers Day 1 retention of new users
     */
    public void setOneDayRetentionNewUsers(Long OneDayRetentionNewUsers) {
        this.OneDayRetentionNewUsers = OneDayRetentionNewUsers;
    }

    /**
     * Get Day 2 retention of new users 
     * @return TwoDayRetentionNewUsers Day 2 retention of new users
     */
    public Long getTwoDayRetentionNewUsers() {
        return this.TwoDayRetentionNewUsers;
    }

    /**
     * Set Day 2 retention of new users
     * @param TwoDayRetentionNewUsers Day 2 retention of new users
     */
    public void setTwoDayRetentionNewUsers(Long TwoDayRetentionNewUsers) {
        this.TwoDayRetentionNewUsers = TwoDayRetentionNewUsers;
    }

    /**
     * Get Day 3 retention of new users 
     * @return ThreeDayRetentionNewUsers Day 3 retention of new users
     */
    public Long getThreeDayRetentionNewUsers() {
        return this.ThreeDayRetentionNewUsers;
    }

    /**
     * Set Day 3 retention of new users
     * @param ThreeDayRetentionNewUsers Day 3 retention of new users
     */
    public void setThreeDayRetentionNewUsers(Long ThreeDayRetentionNewUsers) {
        this.ThreeDayRetentionNewUsers = ThreeDayRetentionNewUsers;
    }

    /**
     * Get Day 4 retention of new users 
     * @return FourDayRetentionNewUsers Day 4 retention of new users
     */
    public Long getFourDayRetentionNewUsers() {
        return this.FourDayRetentionNewUsers;
    }

    /**
     * Set Day 4 retention of new users
     * @param FourDayRetentionNewUsers Day 4 retention of new users
     */
    public void setFourDayRetentionNewUsers(Long FourDayRetentionNewUsers) {
        this.FourDayRetentionNewUsers = FourDayRetentionNewUsers;
    }

    /**
     * Get Day 5 retention of new users 
     * @return FiveDayRetentionNewUsers Day 5 retention of new users
     */
    public Long getFiveDayRetentionNewUsers() {
        return this.FiveDayRetentionNewUsers;
    }

    /**
     * Set Day 5 retention of new users
     * @param FiveDayRetentionNewUsers Day 5 retention of new users
     */
    public void setFiveDayRetentionNewUsers(Long FiveDayRetentionNewUsers) {
        this.FiveDayRetentionNewUsers = FiveDayRetentionNewUsers;
    }

    /**
     * Get Day 6 retention of new users 
     * @return SixDayRetentionNewUsers Day 6 retention of new users
     */
    public Long getSixDayRetentionNewUsers() {
        return this.SixDayRetentionNewUsers;
    }

    /**
     * Set Day 6 retention of new users
     * @param SixDayRetentionNewUsers Day 6 retention of new users
     */
    public void setSixDayRetentionNewUsers(Long SixDayRetentionNewUsers) {
        this.SixDayRetentionNewUsers = SixDayRetentionNewUsers;
    }

    /**
     * Get Day 7 retention of new users 
     * @return SevenDayRetentionNewUsers Day 7 retention of new users
     */
    public Long getSevenDayRetentionNewUsers() {
        return this.SevenDayRetentionNewUsers;
    }

    /**
     * Set Day 7 retention of new users
     * @param SevenDayRetentionNewUsers Day 7 retention of new users
     */
    public void setSevenDayRetentionNewUsers(Long SevenDayRetentionNewUsers) {
        this.SevenDayRetentionNewUsers = SevenDayRetentionNewUsers;
    }

    /**
     * Get Day 14 retention of new users 
     * @return FourteenDayRetentionNewUsers Day 14 retention of new users
     */
    public Long getFourteenDayRetentionNewUsers() {
        return this.FourteenDayRetentionNewUsers;
    }

    /**
     * Set Day 14 retention of new users
     * @param FourteenDayRetentionNewUsers Day 14 retention of new users
     */
    public void setFourteenDayRetentionNewUsers(Long FourteenDayRetentionNewUsers) {
        this.FourteenDayRetentionNewUsers = FourteenDayRetentionNewUsers;
    }

    /**
     * Get Day 30 retention of new users 
     * @return ThirtyDayRetentionNewUsers Day 30 retention of new users
     */
    public Long getThirtyDayRetentionNewUsers() {
        return this.ThirtyDayRetentionNewUsers;
    }

    /**
     * Set Day 30 retention of new users
     * @param ThirtyDayRetentionNewUsers Day 30 retention of new users
     */
    public void setThirtyDayRetentionNewUsers(Long ThirtyDayRetentionNewUsers) {
        this.ThirtyDayRetentionNewUsers = ThirtyDayRetentionNewUsers;
    }

    /**
     * Get Data time in YYYYMMDD format 
     * @return DataTime Data time in YYYYMMDD format
     */
    public String getDataTime() {
        return this.DataTime;
    }

    /**
     * Set Data time in YYYYMMDD format
     * @param DataTime Data time in YYYYMMDD format
     */
    public void setDataTime(String DataTime) {
        this.DataTime = DataTime;
    }

    public RetentionData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetentionData(RetentionData source) {
        if (source.ActiveUserCount != null) {
            this.ActiveUserCount = new Long(source.ActiveUserCount);
        }
        if (source.OneDayRetentionUsers != null) {
            this.OneDayRetentionUsers = new Long(source.OneDayRetentionUsers);
        }
        if (source.TwoDayRetentionUsers != null) {
            this.TwoDayRetentionUsers = new Long(source.TwoDayRetentionUsers);
        }
        if (source.ThreeDayRetentionUsers != null) {
            this.ThreeDayRetentionUsers = new Long(source.ThreeDayRetentionUsers);
        }
        if (source.FourDayRetentionUsers != null) {
            this.FourDayRetentionUsers = new Long(source.FourDayRetentionUsers);
        }
        if (source.FiveDayRetentionUsers != null) {
            this.FiveDayRetentionUsers = new Long(source.FiveDayRetentionUsers);
        }
        if (source.SixDayRetentionUsers != null) {
            this.SixDayRetentionUsers = new Long(source.SixDayRetentionUsers);
        }
        if (source.SevenDayRetentionUsers != null) {
            this.SevenDayRetentionUsers = new Long(source.SevenDayRetentionUsers);
        }
        if (source.FourteenDayRetentionUsers != null) {
            this.FourteenDayRetentionUsers = new Long(source.FourteenDayRetentionUsers);
        }
        if (source.ThirtyDayRetentionUsers != null) {
            this.ThirtyDayRetentionUsers = new Long(source.ThirtyDayRetentionUsers);
        }
        if (source.NewUserCount != null) {
            this.NewUserCount = new Long(source.NewUserCount);
        }
        if (source.OneDayRetentionNewUsers != null) {
            this.OneDayRetentionNewUsers = new Long(source.OneDayRetentionNewUsers);
        }
        if (source.TwoDayRetentionNewUsers != null) {
            this.TwoDayRetentionNewUsers = new Long(source.TwoDayRetentionNewUsers);
        }
        if (source.ThreeDayRetentionNewUsers != null) {
            this.ThreeDayRetentionNewUsers = new Long(source.ThreeDayRetentionNewUsers);
        }
        if (source.FourDayRetentionNewUsers != null) {
            this.FourDayRetentionNewUsers = new Long(source.FourDayRetentionNewUsers);
        }
        if (source.FiveDayRetentionNewUsers != null) {
            this.FiveDayRetentionNewUsers = new Long(source.FiveDayRetentionNewUsers);
        }
        if (source.SixDayRetentionNewUsers != null) {
            this.SixDayRetentionNewUsers = new Long(source.SixDayRetentionNewUsers);
        }
        if (source.SevenDayRetentionNewUsers != null) {
            this.SevenDayRetentionNewUsers = new Long(source.SevenDayRetentionNewUsers);
        }
        if (source.FourteenDayRetentionNewUsers != null) {
            this.FourteenDayRetentionNewUsers = new Long(source.FourteenDayRetentionNewUsers);
        }
        if (source.ThirtyDayRetentionNewUsers != null) {
            this.ThirtyDayRetentionNewUsers = new Long(source.ThirtyDayRetentionNewUsers);
        }
        if (source.DataTime != null) {
            this.DataTime = new String(source.DataTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActiveUserCount", this.ActiveUserCount);
        this.setParamSimple(map, prefix + "OneDayRetentionUsers", this.OneDayRetentionUsers);
        this.setParamSimple(map, prefix + "TwoDayRetentionUsers", this.TwoDayRetentionUsers);
        this.setParamSimple(map, prefix + "ThreeDayRetentionUsers", this.ThreeDayRetentionUsers);
        this.setParamSimple(map, prefix + "FourDayRetentionUsers", this.FourDayRetentionUsers);
        this.setParamSimple(map, prefix + "FiveDayRetentionUsers", this.FiveDayRetentionUsers);
        this.setParamSimple(map, prefix + "SixDayRetentionUsers", this.SixDayRetentionUsers);
        this.setParamSimple(map, prefix + "SevenDayRetentionUsers", this.SevenDayRetentionUsers);
        this.setParamSimple(map, prefix + "FourteenDayRetentionUsers", this.FourteenDayRetentionUsers);
        this.setParamSimple(map, prefix + "ThirtyDayRetentionUsers", this.ThirtyDayRetentionUsers);
        this.setParamSimple(map, prefix + "NewUserCount", this.NewUserCount);
        this.setParamSimple(map, prefix + "OneDayRetentionNewUsers", this.OneDayRetentionNewUsers);
        this.setParamSimple(map, prefix + "TwoDayRetentionNewUsers", this.TwoDayRetentionNewUsers);
        this.setParamSimple(map, prefix + "ThreeDayRetentionNewUsers", this.ThreeDayRetentionNewUsers);
        this.setParamSimple(map, prefix + "FourDayRetentionNewUsers", this.FourDayRetentionNewUsers);
        this.setParamSimple(map, prefix + "FiveDayRetentionNewUsers", this.FiveDayRetentionNewUsers);
        this.setParamSimple(map, prefix + "SixDayRetentionNewUsers", this.SixDayRetentionNewUsers);
        this.setParamSimple(map, prefix + "SevenDayRetentionNewUsers", this.SevenDayRetentionNewUsers);
        this.setParamSimple(map, prefix + "FourteenDayRetentionNewUsers", this.FourteenDayRetentionNewUsers);
        this.setParamSimple(map, prefix + "ThirtyDayRetentionNewUsers", this.ThirtyDayRetentionNewUsers);
        this.setParamSimple(map, prefix + "DataTime", this.DataTime);

    }
}

