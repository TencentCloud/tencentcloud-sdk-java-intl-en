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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCaptchaInfoListInternationalRequest extends AbstractModel {

    /**
    * <p>Pagination parameter - page number</p>
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * <p>Pagination parameters - number of records per page</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Query parameter - Behavior verification type</p><p>Enumeration values:</p><ul><li>1: Invisible verification</li><li>2: Slide verification</li><li>8: Graphical verification</li><li>9: Voice verification</li></ul>
    */
    @SerializedName("UserSetCapTypeArr")
    @Expose
    private String [] UserSetCapTypeArr;

    /**
    * <p>Query parameter - risk control level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul>
    */
    @SerializedName("VerifyRankArr")
    @Expose
    private String [] VerifyRankArr;

    /**
    * <p>Query parameter - client multiple selection</p><p>Enumeration values:</p><ul><li>web:</li><li>ios </li><li>android</li></ul>
    */
    @SerializedName("ChannelInfoArr")
    @Expose
    private String [] ChannelInfoArr;

    /**
    * <p>Query parameter -Captcha appid</p>
    */
    @SerializedName("CaptchaAppId")
    @Expose
    private String CaptchaAppId;

    /**
    * <p>Query parameter - Captcha name</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>Sorting parameter</p><p>Input limits: desc: in descending order by creation time; asc: in ascending order by creation time</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private OrderByInternational OrderBy;

    /**
     * Get <p>Pagination parameter - page number</p> 
     * @return PageIndex <p>Pagination parameter - page number</p>
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set <p>Pagination parameter - page number</p>
     * @param PageIndex <p>Pagination parameter - page number</p>
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get <p>Pagination parameters - number of records per page</p> 
     * @return PageSize <p>Pagination parameters - number of records per page</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Pagination parameters - number of records per page</p>
     * @param PageSize <p>Pagination parameters - number of records per page</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Query parameter - Behavior verification type</p><p>Enumeration values:</p><ul><li>1: Invisible verification</li><li>2: Slide verification</li><li>8: Graphical verification</li><li>9: Voice verification</li></ul> 
     * @return UserSetCapTypeArr <p>Query parameter - Behavior verification type</p><p>Enumeration values:</p><ul><li>1: Invisible verification</li><li>2: Slide verification</li><li>8: Graphical verification</li><li>9: Voice verification</li></ul>
     */
    public String [] getUserSetCapTypeArr() {
        return this.UserSetCapTypeArr;
    }

    /**
     * Set <p>Query parameter - Behavior verification type</p><p>Enumeration values:</p><ul><li>1: Invisible verification</li><li>2: Slide verification</li><li>8: Graphical verification</li><li>9: Voice verification</li></ul>
     * @param UserSetCapTypeArr <p>Query parameter - Behavior verification type</p><p>Enumeration values:</p><ul><li>1: Invisible verification</li><li>2: Slide verification</li><li>8: Graphical verification</li><li>9: Voice verification</li></ul>
     */
    public void setUserSetCapTypeArr(String [] UserSetCapTypeArr) {
        this.UserSetCapTypeArr = UserSetCapTypeArr;
    }

    /**
     * Get <p>Query parameter - risk control level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul> 
     * @return VerifyRankArr <p>Query parameter - risk control level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul>
     */
    public String [] getVerifyRankArr() {
        return this.VerifyRankArr;
    }

    /**
     * Set <p>Query parameter - risk control level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul>
     * @param VerifyRankArr <p>Query parameter - risk control level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul>
     */
    public void setVerifyRankArr(String [] VerifyRankArr) {
        this.VerifyRankArr = VerifyRankArr;
    }

    /**
     * Get <p>Query parameter - client multiple selection</p><p>Enumeration values:</p><ul><li>web:</li><li>ios </li><li>android</li></ul> 
     * @return ChannelInfoArr <p>Query parameter - client multiple selection</p><p>Enumeration values:</p><ul><li>web:</li><li>ios </li><li>android</li></ul>
     */
    public String [] getChannelInfoArr() {
        return this.ChannelInfoArr;
    }

    /**
     * Set <p>Query parameter - client multiple selection</p><p>Enumeration values:</p><ul><li>web:</li><li>ios </li><li>android</li></ul>
     * @param ChannelInfoArr <p>Query parameter - client multiple selection</p><p>Enumeration values:</p><ul><li>web:</li><li>ios </li><li>android</li></ul>
     */
    public void setChannelInfoArr(String [] ChannelInfoArr) {
        this.ChannelInfoArr = ChannelInfoArr;
    }

    /**
     * Get <p>Query parameter -Captcha appid</p> 
     * @return CaptchaAppId <p>Query parameter -Captcha appid</p>
     */
    public String getCaptchaAppId() {
        return this.CaptchaAppId;
    }

    /**
     * Set <p>Query parameter -Captcha appid</p>
     * @param CaptchaAppId <p>Query parameter -Captcha appid</p>
     */
    public void setCaptchaAppId(String CaptchaAppId) {
        this.CaptchaAppId = CaptchaAppId;
    }

    /**
     * Get <p>Query parameter - Captcha name</p> 
     * @return AppName <p>Query parameter - Captcha name</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>Query parameter - Captcha name</p>
     * @param AppName <p>Query parameter - Captcha name</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>Sorting parameter</p><p>Input limits: desc: in descending order by creation time; asc: in ascending order by creation time</p> 
     * @return OrderBy <p>Sorting parameter</p><p>Input limits: desc: in descending order by creation time; asc: in ascending order by creation time</p>
     */
    public OrderByInternational getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Sorting parameter</p><p>Input limits: desc: in descending order by creation time; asc: in ascending order by creation time</p>
     * @param OrderBy <p>Sorting parameter</p><p>Input limits: desc: in descending order by creation time; asc: in ascending order by creation time</p>
     */
    public void setOrderBy(OrderByInternational OrderBy) {
        this.OrderBy = OrderBy;
    }

    public DescribeCaptchaInfoListInternationalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaptchaInfoListInternationalRequest(DescribeCaptchaInfoListInternationalRequest source) {
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.UserSetCapTypeArr != null) {
            this.UserSetCapTypeArr = new String[source.UserSetCapTypeArr.length];
            for (int i = 0; i < source.UserSetCapTypeArr.length; i++) {
                this.UserSetCapTypeArr[i] = new String(source.UserSetCapTypeArr[i]);
            }
        }
        if (source.VerifyRankArr != null) {
            this.VerifyRankArr = new String[source.VerifyRankArr.length];
            for (int i = 0; i < source.VerifyRankArr.length; i++) {
                this.VerifyRankArr[i] = new String(source.VerifyRankArr[i]);
            }
        }
        if (source.ChannelInfoArr != null) {
            this.ChannelInfoArr = new String[source.ChannelInfoArr.length];
            for (int i = 0; i < source.ChannelInfoArr.length; i++) {
                this.ChannelInfoArr[i] = new String(source.ChannelInfoArr[i]);
            }
        }
        if (source.CaptchaAppId != null) {
            this.CaptchaAppId = new String(source.CaptchaAppId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new OrderByInternational(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "UserSetCapTypeArr.", this.UserSetCapTypeArr);
        this.setParamArraySimple(map, prefix + "VerifyRankArr.", this.VerifyRankArr);
        this.setParamArraySimple(map, prefix + "ChannelInfoArr.", this.ChannelInfoArr);
        this.setParamSimple(map, prefix + "CaptchaAppId", this.CaptchaAppId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamObj(map, prefix + "OrderBy.", this.OrderBy);

    }
}

