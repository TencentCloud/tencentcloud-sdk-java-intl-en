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

public class CreatePermissionRanksRequest extends AbstractModel {

    /**
    * <p>page number</p>
    */
    @SerializedName("TableId")
    @Expose
    private Long TableId;

    /**
    * <p>Mode</p><p>Enumeration value:</p><ul><li>ALL: All</li><li>Specify: Specify</li><li>TAG: Tag</li></ul><p>Default value: ALL</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>Role type</p><p>Enumeration value:</p><ul><li>ROLES: By role</li><li>Others: Other</li></ul><p>Default value: Others</p>
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * <p>All page numbers</p>
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * <p>Rule information</p>
    */
    @SerializedName("RulerInfo")
    @Expose
    private String RulerInfo;

    /**
    * <p>Type</p><p>Enumeration value:</p><ul><li>ROW: row permission</li><li>COLUMN: column permission</li></ul><p>Default value: ROW</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Enabled status</p><p>Enumeration value:</p><ul><li>Open: Turn on</li><li>Close: Turn off</li></ul><p>Default value: Close</p>
    */
    @SerializedName("OpenStatus")
    @Expose
    private String OpenStatus;

    /**
    * <p>Project ID.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Row/column permission configuration</p>
    */
    @SerializedName("RowColumnConfigList")
    @Expose
    private RowColumnConfig [] RowColumnConfigList;

    /**
     * Get <p>page number</p> 
     * @return TableId <p>page number</p>
     */
    public Long getTableId() {
        return this.TableId;
    }

    /**
     * Set <p>page number</p>
     * @param TableId <p>page number</p>
     */
    public void setTableId(Long TableId) {
        this.TableId = TableId;
    }

    /**
     * Get <p>Mode</p><p>Enumeration value:</p><ul><li>ALL: All</li><li>Specify: Specify</li><li>TAG: Tag</li></ul><p>Default value: ALL</p> 
     * @return Mode <p>Mode</p><p>Enumeration value:</p><ul><li>ALL: All</li><li>Specify: Specify</li><li>TAG: Tag</li></ul><p>Default value: ALL</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>Mode</p><p>Enumeration value:</p><ul><li>ALL: All</li><li>Specify: Specify</li><li>TAG: Tag</li></ul><p>Default value: ALL</p>
     * @param Mode <p>Mode</p><p>Enumeration value:</p><ul><li>ALL: All</li><li>Specify: Specify</li><li>TAG: Tag</li></ul><p>Default value: ALL</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>Role type</p><p>Enumeration value:</p><ul><li>ROLES: By role</li><li>Others: Other</li></ul><p>Default value: Others</p> 
     * @return RoleType <p>Role type</p><p>Enumeration value:</p><ul><li>ROLES: By role</li><li>Others: Other</li></ul><p>Default value: Others</p>
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set <p>Role type</p><p>Enumeration value:</p><ul><li>ROLES: By role</li><li>Others: Other</li></ul><p>Default value: Others</p>
     * @param RoleType <p>Role type</p><p>Enumeration value:</p><ul><li>ROLES: By role</li><li>Others: Other</li></ul><p>Default value: Others</p>
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get <p>All page numbers</p> 
     * @return RoleId <p>All page numbers</p>
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set <p>All page numbers</p>
     * @param RoleId <p>All page numbers</p>
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get <p>Rule information</p> 
     * @return RulerInfo <p>Rule information</p>
     */
    public String getRulerInfo() {
        return this.RulerInfo;
    }

    /**
     * Set <p>Rule information</p>
     * @param RulerInfo <p>Rule information</p>
     */
    public void setRulerInfo(String RulerInfo) {
        this.RulerInfo = RulerInfo;
    }

    /**
     * Get <p>Type</p><p>Enumeration value:</p><ul><li>ROW: row permission</li><li>COLUMN: column permission</li></ul><p>Default value: ROW</p> 
     * @return Type <p>Type</p><p>Enumeration value:</p><ul><li>ROW: row permission</li><li>COLUMN: column permission</li></ul><p>Default value: ROW</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Type</p><p>Enumeration value:</p><ul><li>ROW: row permission</li><li>COLUMN: column permission</li></ul><p>Default value: ROW</p>
     * @param Type <p>Type</p><p>Enumeration value:</p><ul><li>ROW: row permission</li><li>COLUMN: column permission</li></ul><p>Default value: ROW</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Enabled status</p><p>Enumeration value:</p><ul><li>Open: Turn on</li><li>Close: Turn off</li></ul><p>Default value: Close</p> 
     * @return OpenStatus <p>Enabled status</p><p>Enumeration value:</p><ul><li>Open: Turn on</li><li>Close: Turn off</li></ul><p>Default value: Close</p>
     */
    public String getOpenStatus() {
        return this.OpenStatus;
    }

    /**
     * Set <p>Enabled status</p><p>Enumeration value:</p><ul><li>Open: Turn on</li><li>Close: Turn off</li></ul><p>Default value: Close</p>
     * @param OpenStatus <p>Enabled status</p><p>Enumeration value:</p><ul><li>Open: Turn on</li><li>Close: Turn off</li></ul><p>Default value: Close</p>
     */
    public void setOpenStatus(String OpenStatus) {
        this.OpenStatus = OpenStatus;
    }

    /**
     * Get <p>Project ID.</p> 
     * @return ProjectId <p>Project ID.</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID.</p>
     * @param ProjectId <p>Project ID.</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Row/column permission configuration</p> 
     * @return RowColumnConfigList <p>Row/column permission configuration</p>
     */
    public RowColumnConfig [] getRowColumnConfigList() {
        return this.RowColumnConfigList;
    }

    /**
     * Set <p>Row/column permission configuration</p>
     * @param RowColumnConfigList <p>Row/column permission configuration</p>
     */
    public void setRowColumnConfigList(RowColumnConfig [] RowColumnConfigList) {
        this.RowColumnConfigList = RowColumnConfigList;
    }

    public CreatePermissionRanksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePermissionRanksRequest(CreatePermissionRanksRequest source) {
        if (source.TableId != null) {
            this.TableId = new Long(source.TableId);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.RulerInfo != null) {
            this.RulerInfo = new String(source.RulerInfo);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.OpenStatus != null) {
            this.OpenStatus = new String(source.OpenStatus);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RowColumnConfigList != null) {
            this.RowColumnConfigList = new RowColumnConfig[source.RowColumnConfigList.length];
            for (int i = 0; i < source.RowColumnConfigList.length; i++) {
                this.RowColumnConfigList[i] = new RowColumnConfig(source.RowColumnConfigList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RulerInfo", this.RulerInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "OpenStatus", this.OpenStatus);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "RowColumnConfigList.", this.RowColumnConfigList);

    }
}

