package com.aitumik.alarm.data.models

data class Alarm(val Id: Int) {
    override fun toString(): String {
        return "Alarm ${Id}"
    }
}