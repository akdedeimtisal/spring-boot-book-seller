package model;

public enum Role {
    USER, //default
    ADMIN, //admin manager , CRUD
    SYSTEM_MANAGER // internal operations , e.g. Changing the role of user
}
