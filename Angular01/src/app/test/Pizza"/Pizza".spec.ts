import { ComponentFixture, TestBed } from "@angular/core/testing";
import { NO_ERRORS_SCHEMA } from "@angular/core";
import { Pizza } from "./Pizza"";

describe("Pizza", () => {
    let comp: Pizza;
    let fixture: ComponentFixture<Pizza>;

    beforeEach(() => {
        TestBed.configureTestingModule({
            declarations: [ Pizza ],
            schemas: [ NO_ERRORS_SCHEMA ]
        });
        fixture = TestBed.createComponent(Pizza);
        comp = fixture.componentInstance;
    });

    it("can load instance", () => {
        expect(comp).toBeTruthy();
    });

});