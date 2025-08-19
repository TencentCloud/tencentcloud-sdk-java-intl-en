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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseStateAction extends AbstractModel {

    /**
    * Whether the edit button is visible.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShowEdit")
    @Expose
    private Boolean ShowEdit;

    /**
    * Whether the edit button is clickable.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsEdit")
    @Expose
    private Boolean IsEdit;

    /**
    * Edit button text.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EditText")
    @Expose
    private String EditText;

    /**
    * Edit-disabled hint.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EditTips")
    @Expose
    private String EditTips;

    /**
    * Whether the deletion button is visible.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShowDel")
    @Expose
    private Boolean ShowDel;

    /**
    * Whether the deletion button is clickable.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDel")
    @Expose
    private Boolean IsDel;

    /**
    * Delete button text.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DelText")
    @Expose
    private String DelText;

    /**
    * Delete-disabled hint.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DelTips")
    @Expose
    private String DelTips;

    /**
    * Whether the copy button is visible.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShowCopy")
    @Expose
    private Boolean ShowCopy;

    /**
    * Whether it is visible.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShowView")
    @Expose
    private Boolean ShowView;

    /**
    * Whether renaming is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShowRename")
    @Expose
    private Boolean ShowRename;

    /**
     * Get Whether the edit button is visible.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShowEdit Whether the edit button is visible.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getShowEdit() {
        return this.ShowEdit;
    }

    /**
     * Set Whether the edit button is visible.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShowEdit Whether the edit button is visible.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShowEdit(Boolean ShowEdit) {
        this.ShowEdit = ShowEdit;
    }

    /**
     * Get Whether the edit button is clickable.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsEdit Whether the edit button is clickable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsEdit() {
        return this.IsEdit;
    }

    /**
     * Set Whether the edit button is clickable.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsEdit Whether the edit button is clickable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsEdit(Boolean IsEdit) {
        this.IsEdit = IsEdit;
    }

    /**
     * Get Edit button text.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EditText Edit button text.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEditText() {
        return this.EditText;
    }

    /**
     * Set Edit button text.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EditText Edit button text.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEditText(String EditText) {
        this.EditText = EditText;
    }

    /**
     * Get Edit-disabled hint.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EditTips Edit-disabled hint.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEditTips() {
        return this.EditTips;
    }

    /**
     * Set Edit-disabled hint.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EditTips Edit-disabled hint.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEditTips(String EditTips) {
        this.EditTips = EditTips;
    }

    /**
     * Get Whether the deletion button is visible.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShowDel Whether the deletion button is visible.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getShowDel() {
        return this.ShowDel;
    }

    /**
     * Set Whether the deletion button is visible.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShowDel Whether the deletion button is visible.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShowDel(Boolean ShowDel) {
        this.ShowDel = ShowDel;
    }

    /**
     * Get Whether the deletion button is clickable.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDel Whether the deletion button is clickable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsDel() {
        return this.IsDel;
    }

    /**
     * Set Whether the deletion button is clickable.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDel Whether the deletion button is clickable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDel(Boolean IsDel) {
        this.IsDel = IsDel;
    }

    /**
     * Get Delete button text.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DelText Delete button text.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDelText() {
        return this.DelText;
    }

    /**
     * Set Delete button text.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DelText Delete button text.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDelText(String DelText) {
        this.DelText = DelText;
    }

    /**
     * Get Delete-disabled hint.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DelTips Delete-disabled hint.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDelTips() {
        return this.DelTips;
    }

    /**
     * Set Delete-disabled hint.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DelTips Delete-disabled hint.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDelTips(String DelTips) {
        this.DelTips = DelTips;
    }

    /**
     * Get Whether the copy button is visible.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShowCopy Whether the copy button is visible.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getShowCopy() {
        return this.ShowCopy;
    }

    /**
     * Set Whether the copy button is visible.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShowCopy Whether the copy button is visible.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShowCopy(Boolean ShowCopy) {
        this.ShowCopy = ShowCopy;
    }

    /**
     * Get Whether it is visible.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShowView Whether it is visible.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getShowView() {
        return this.ShowView;
    }

    /**
     * Set Whether it is visible.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShowView Whether it is visible.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShowView(Boolean ShowView) {
        this.ShowView = ShowView;
    }

    /**
     * Get Whether renaming is allowed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShowRename Whether renaming is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getShowRename() {
        return this.ShowRename;
    }

    /**
     * Set Whether renaming is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShowRename Whether renaming is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShowRename(Boolean ShowRename) {
        this.ShowRename = ShowRename;
    }

    public BaseStateAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseStateAction(BaseStateAction source) {
        if (source.ShowEdit != null) {
            this.ShowEdit = new Boolean(source.ShowEdit);
        }
        if (source.IsEdit != null) {
            this.IsEdit = new Boolean(source.IsEdit);
        }
        if (source.EditText != null) {
            this.EditText = new String(source.EditText);
        }
        if (source.EditTips != null) {
            this.EditTips = new String(source.EditTips);
        }
        if (source.ShowDel != null) {
            this.ShowDel = new Boolean(source.ShowDel);
        }
        if (source.IsDel != null) {
            this.IsDel = new Boolean(source.IsDel);
        }
        if (source.DelText != null) {
            this.DelText = new String(source.DelText);
        }
        if (source.DelTips != null) {
            this.DelTips = new String(source.DelTips);
        }
        if (source.ShowCopy != null) {
            this.ShowCopy = new Boolean(source.ShowCopy);
        }
        if (source.ShowView != null) {
            this.ShowView = new Boolean(source.ShowView);
        }
        if (source.ShowRename != null) {
            this.ShowRename = new Boolean(source.ShowRename);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShowEdit", this.ShowEdit);
        this.setParamSimple(map, prefix + "IsEdit", this.IsEdit);
        this.setParamSimple(map, prefix + "EditText", this.EditText);
        this.setParamSimple(map, prefix + "EditTips", this.EditTips);
        this.setParamSimple(map, prefix + "ShowDel", this.ShowDel);
        this.setParamSimple(map, prefix + "IsDel", this.IsDel);
        this.setParamSimple(map, prefix + "DelText", this.DelText);
        this.setParamSimple(map, prefix + "DelTips", this.DelTips);
        this.setParamSimple(map, prefix + "ShowCopy", this.ShowCopy);
        this.setParamSimple(map, prefix + "ShowView", this.ShowView);
        this.setParamSimple(map, prefix + "ShowRename", this.ShowRename);

    }
}

